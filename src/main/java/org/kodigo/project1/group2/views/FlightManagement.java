/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.views;

import java.sql.Timestamp;
import org.kodigo.project1.group2.controllers.FlightController;


/**
 *
 * @author Danny
 */
public class FlightManagement extends javax.swing.JFrame {

    private FlightController flightcontroller = new FlightController();
    /**
     * Creates new form GestionVuelo2
     */
    public FlightManagement() {
        initComponents();
        setLocationRelativeTo(null);
        reloadFlights();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNewFlight = new javax.swing.JButton();
        btnUpdateFlight = new javax.swing.JButton();
        btnWeatherReport = new javax.swing.JButton();
        btnCancelFlight = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Flight = new javax.swing.JTable();
        btnExcelManagement = new javax.swing.JButton();
        btnMailing = new javax.swing.JButton();
        Cb_Select = new javax.swing.JComboBox<>();
        btnAircraft = new javax.swing.JButton();
        btnAirline = new javax.swing.JButton();
        btnFlightStatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Management");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setText("Flight Management");
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnNewFlight.setText("New Flight");
        btnNewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFlightActionPerformed(evt);
            }
        });

        btnUpdateFlight.setText("Update Flight");
        btnUpdateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFlightActionPerformed(evt);
            }
        });

        btnWeatherReport.setText("Weather Report");
        btnWeatherReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeatherReportActionPerformed(evt);
            }
        });

        btnCancelFlight.setText("Cancel Flight");
        btnCancelFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelFlightActionPerformed(evt);
            }
        });

        Table_Flight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table_Flight);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        btnExcelManagement.setText("Excel Management");
        btnExcelManagement.setActionCommand("excelManage");
        btnExcelManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelManagementActionPerformed(evt);
            }
        });

        btnMailing.setText("Mailing");
        btnMailing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMailingActionPerformed(evt);
            }
        });

        Cb_Select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Country", "City" }));
        Cb_Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_SelectActionPerformed(evt);
            }
        });

        btnAircraft.setText("Aircraft");
        btnAircraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAircraftActionPerformed(evt);
            }
        });

        btnAirline.setText("Airline");
        btnAirline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirlineActionPerformed(evt);
            }
        });

        btnFlightStatus.setText("Flight status");
        btnFlightStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlightStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnNewFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnWeatherReport, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(btnUpdateFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMailing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cb_Select, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAircraft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAirline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnFlightStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelFlight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcelManagement, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWeatherReport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcelManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFlightStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMailing, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAirline, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAircraft, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cb_Select, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFlightActionPerformed
       openUpdateFlight();      
    }//GEN-LAST:event_btnUpdateFlightActionPerformed

    private void btnNewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFlightActionPerformed
        openNewFlight();
    }//GEN-LAST:event_btnNewFlightActionPerformed

    private void btnCancelFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelFlightActionPerformed
        openCancelFlight();
    }//GEN-LAST:event_btnCancelFlightActionPerformed
 
    private void btnWeatherReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeatherReportActionPerformed
        openWeatherReport();
    }//GEN-LAST:event_btnWeatherReportActionPerformed
 
    private void btnMailingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMailingActionPerformed
       openMailing();
    }//GEN-LAST:event_btnMailingActionPerformed

    private void btnExcelManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelManagementActionPerformed
        openExcel();
    }//GEN-LAST:event_btnExcelManagementActionPerformed
  
    private void Cb_SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_SelectActionPerformed
        openSelectCountryORCity();
    }//GEN-LAST:event_Cb_SelectActionPerformed
  
    private void btnAircraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAircraftActionPerformed
        openAircraft();
    }//GEN-LAST:event_btnAircraftActionPerformed

    private void btnAirlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirlineActionPerformed
        openAirline();
    }//GEN-LAST:event_btnAirlineActionPerformed
  
    private void btnFlightStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlightStatusActionPerformed
        openFlightStatus();
    }//GEN-LAST:event_btnFlightStatusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlightManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightManagement().setVisible(true);
            }
        });
    }
    //Reaload data.
    private void reloadFlights(){
        Table_Flight.setModel(flightcontroller.getFlights());
    }
    //Open diferents windows
    public void openUpdateFlight(){
        UpdateFlight updateflight = new UpdateFlight();
        updateflight.setVisible(true);
        updateflight.txtflightnumber.setText((String) Table_Flight.getModel().getValueAt(Table_Flight.getSelectedRow(), 0));
        reloadFlights();
    }

    private void openNewFlight(){
        NewFlight newFlight = new NewFlight(this, true);
        newFlight.setVisible(true);
        reloadFlights();
    }
     
    private void openCancelFlight(){
        CancelFlight cancelflight = new CancelFlight();
        cancelflight.setVisible(true);
    }
   
    private void openWeatherReport(){
        WeatherReport weatherreport = new WeatherReport();
        weatherreport.setVisible(true);
    }
   
    private void openMailing(){
        Mailing mailing = new Mailing();
        mailing.setVisible(true);
    }
    
    private void openExcel(){
        ExcelManagement excel = new ExcelManagement();
        excel.setVisible(true);
    }
    
    private void openSelectCountryORCity(){
        if(Cb_Select.getSelectedItem().toString() == "Country"){
            CountryManagement country = new CountryManagement();
            country.setVisible(true);
        }
        if(Cb_Select.getSelectedItem().toString() == "City"){
            CityManagement city = new CityManagement();
            city.setVisible(true);
        }
    }
    
     private void openAircraft(){
        AirCraftManagement AirCraftManagement = new AirCraftManagement();
        AirCraftManagement.setVisible(true);
    }
     
     private void openAirline(){
        AirlineManagement AirlineManagement = new AirlineManagement();
        AirlineManagement.setVisible(true);
    }
     
     private void openFlightStatus(){
        FlightStatus FlightStatus = new FlightStatus();
        FlightStatus.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb_Select;
    private javax.swing.JTable Table_Flight;
    private javax.swing.JButton btnAircraft;
    private javax.swing.JButton btnAirline;
    private javax.swing.JButton btnCancelFlight;
    private javax.swing.JButton btnExcelManagement;
    private javax.swing.JButton btnFlightStatus;
    private javax.swing.JButton btnMailing;
    private javax.swing.JButton btnNewFlight;
    private javax.swing.JButton btnUpdateFlight;
    private javax.swing.JButton btnWeatherReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
