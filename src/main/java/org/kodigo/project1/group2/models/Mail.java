/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.models;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author JoseM
 */
public class Mail {
    @Getter @Setter private int mailId; 
    @Getter @Setter private String recipient;
    @Getter @Setter private String emailAddress;

    public Mail(int mailId, String recipient, String emailAddress) {
        this.mailId = mailId;
        this.recipient = recipient;
        this.emailAddress = emailAddress;
    }
    
    
    
}
