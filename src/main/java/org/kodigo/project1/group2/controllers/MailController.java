package org.kodigo.project1.group2.controllers;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author Néstor Recinos
 * @author Jaime Reyes
 */
public class MailController {
    
    
    private final Session session = Session.getDefaultInstance(loadProperties());
    
    /** This method preload the properties of the email settings
     * @return the properties values 
     */
    public Properties loadProperties(){
       
       Properties props = System.getProperties();
       
       props.put("mail.smtp.host", "smtp.gmail.com");  
       props.put("mail.smtp.user", "grupo.2.kodigo@gmail.com"); 
       props.put("mail.smtp.auth", "true");    
       props.put("mail.smtp.starttls.enable", "true"); 
       props.put("mail.smtp.port", "587"); 
       
       return props;
    }
    
    public void loadTransportMail(MimeMessage message){
        
        try {            
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", "grupo.2.kodigo@gmail.com", "Grupo2_kodigo");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            
        } catch (MessagingException ex) {
            ex.getMessage();
        }
    }
    
    /** The following method send a email message with an attachment option  
     * @param recevier the address who recieve the mail
     * @param subject the matter of the email message
     * @param bodyMessage the text message 
     * @param attachment the file to attach  
     */
    public void sendMesasage(String recevier, String subject, String bodyMessage, String attachment) {

       session.setDebug(true);
         
        try {
            
            MimeMessage message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress("grupo.2.kodigo@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recevier));
            message.setSubject(subject);
            
            // Create body message
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(bodyMessage);
            
            // Create body attachment
            MimeBodyPart attachBodyPart = new MimeBodyPart();            
            DataSource src = new FileDataSource(attachment);
            attachBodyPart.setDataHandler(new DataHandler(src));
            attachBodyPart.setFileName(attachment);
            
            MimeMultipart multiPart = new MimeMultipart();
            multiPart.addBodyPart(attachBodyPart);
            multiPart.addBodyPart(messageBodyPart);
                    
            message.setContent(multiPart);
            
            loadTransportMail(message);
            
            JOptionPane.showMessageDialog(null,"Mail has been sent successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        } catch (MessagingException me) {
            me.printStackTrace();
            JOptionPane.showMessageDialog(null,"An error ocurred","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
