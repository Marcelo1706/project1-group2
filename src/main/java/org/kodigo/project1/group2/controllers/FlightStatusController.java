/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import lombok.Getter;
import lombok.Setter;
import org.kodigo.project1.group2.models.Database;
import org.kodigo.project1.group2.models.Flight;
import org.kodigo.project1.group2.models.FlightStatus;


/**
 *
 * @author Néstor Recinos
 */
public class FlightStatusController {
    
     @Getter @Setter private Database databaseHandler;
    
    public FlightStatusController(){
        this.databaseHandler = new Database();
    }
    /**
     * 
     * @return 
     */
    public DefaultTableModel getFlightStatusTable(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Number Flight");
        model.addColumn("Flight Status");
        model.addColumn("Flight Log");
        Object[][] data = databaseHandler.select("flightStatus fs inner join flight f on f.flightId  = fs.flightId", "flightStatusId, FLIGHTNUMBER, flightStatus, flightLog", null);
        
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
    
    /**
     * 
     * @param flightStatus
     * @param flightLog
     * @param flight
     * @return 
     */
    public boolean newFlightStatus(String flightStatus, String flightLog, Flight flight){
        return databaseHandler.insert("flightStatus", "flightStatus, flightLog,flightId", "'"+flightStatus+"','"+flightLog+"','"+flight.getFlightId()+"'");
    }
    
    /**
     * 
     * @param flightStatusId
     * @param flightStatus
     * @param flightLog
     * @param flight
     * @return 
     */
    public boolean updateFlightStatus(int flightStatusId,String flightStatus, String flightLog, Flight flight){
        return databaseHandler.update("flightStatus", "flightStatus = '"+flightStatus+"', flightLog = '"+flightLog+"', flightLogId = '"+flight.getFlightId()+"'", "flightStatusId = " + flightStatusId);
    }
    
    /**
     * 
     * @param flightStatusId
     * @return 
     */
    public boolean deleteStatus(int flightStatusId){
        return databaseHandler.delete("flightStatus", "flightStatusId = " + flightStatusId);
    }
    
}
