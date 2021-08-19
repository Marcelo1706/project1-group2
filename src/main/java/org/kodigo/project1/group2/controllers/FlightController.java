/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import lombok.Getter;
import lombok.Setter;
import org.kodigo.project1.group2.models.Aircraft;
import org.kodigo.project1.group2.models.City;
import org.kodigo.project1.group2.models.Database;
import org.kodigo.project1.group2.models.Flight;

/**
 *
 * @author Néstor Recinos
 */
public class FlightController {
    @Getter @Setter private Flight singleFlight;
    @Getter @Setter private Database databaseHandler;
    
    public FlightController(){
        this.databaseHandler = new Database();
    }
    
    public DefaultTableModel getFlights(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Flight Number");
        model.addColumn("Origin City");
        model.addColumn("Destination City");
        model.addColumn("Departure Time");
        model.addColumn("Arrival Time");
        model.addColumn("Aircraft");
        Object[][] data = databaseHandler.select("flight", "flightNumber,originCity,destinationCity,departureTime,arrivalTime,aircraft", null);
        
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
    
    public boolean newFlight(String flightNumber, City originCity, City destinationCity, Date departureTime, Date arrivalTime, Aircraft aircraft){
        return databaseHandler.insert("flight", "flightNumber, originCity, destinationCity, departureTime, arrivalTime, aircraft", "'"+flightNumber+"','"+originCity.getCityId()+"','"+destinationCity.getCityId()+"','"+departureTime+"','"+arrivalTime+"','"+aircraft.getAircraftId()+"'");
    }
    
    public boolean updateFlight(String flightNumber, City originCity, City destinationCity, Date departureTime, Date arrivalTime){
        return databaseHandler.update("flight", "flightNumber = '"+flightNumber+"', originCityId = '"+originCity.getCityId()+"', destinationCityId = '"+destinationCity.getCityId()+"', departureTime = '"+departureTime+"', arrivalTime = '"+arrivalTime+"'", "flightNumber = " + flightNumber);
    }
    
    public boolean deleteFlight(int flightId){
        return databaseHandler.delete("flight", "flightId = " + flightId);
    }
}
