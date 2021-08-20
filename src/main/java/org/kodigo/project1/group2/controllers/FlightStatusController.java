/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import org.kodigo.project1.group2.models.Database;
import org.kodigo.project1.group2.models.Flight;


/**
 *
 * @author Néstor Recinos
 */
public class FlightStatusController {
    
    private FlightStatusController flightStatus = new FlightStatusController();
    private Database databaseHandler;
    
    public FlightStatusController(){
        this.databaseHandler = new Database();
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
