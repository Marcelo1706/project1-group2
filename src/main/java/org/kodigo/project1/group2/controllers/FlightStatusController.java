/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import javax.swing.table.DefaultTableModel;
import lombok.Getter;
import lombok.Setter;
import org.kodigo.project1.group2.models.Database;
import org.kodigo.project1.group2.models.Flight;


/**
 *
 * @author Néstor Recinos
 */
public class FlightStatusController {
    
     @Getter @Setter private Database databaseHandler;
    
    public FlightStatusController(){
        this.databaseHandler = new Database();
    }
    
    public DefaultTableModel getFlightStatusTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Flight ID");
        model.addColumn("Flight Status");
        model.addColumn("Flight Log");
        Object[][] data = databaseHandler.select("flightStatus", "flightStatusId, flightId, flightStatus, flightLog", null);
        
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
    
    
    public boolean newFlightStatus(String flightStatus, String flightLog, Flight flight){
        return databaseHandler.insert("flightStatus", "flightStatus, flightLog, flight", "'"+flightStatus+"','"+flightLog+"','"+flight.getFlightId()+"'");
    }
    
    public boolean updateFlightStatus(int flightStatusId,String flightStatus, String flightLog, Flight flight){
        return databaseHandler.update("flightStatus", "flightStatus = '"+flightStatus+"', flightLog = '"+flightLog+"', flightLogId = '"+flight.getFlightId()+"'", "flightStatusId = " + flightStatusId);
    }
    
    public boolean deleteStatus(int flightStatusId){
        return databaseHandler.delete("flightStatus", "flightStatusId = " + flightStatusId);
    }
    
}
