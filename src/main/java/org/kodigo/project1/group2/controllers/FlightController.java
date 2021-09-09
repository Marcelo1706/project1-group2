/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import lombok.Getter;
import lombok.Setter;
import org.kodigo.project1.group2.models.Aircraft;
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
        Object[][] data = databaseHandler.select("flight", "flightNumber,originCityId,destinationCityId,departureTime,arrivalTime,aircraftId", null);
        
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
    
    public DefaultTableModel getFlights2(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Number");
        model.addColumn("Flight Number");
        model.addColumn("Origin City");
        model.addColumn("Destination City");
        model.addColumn("Departure Time");
        model.addColumn("Arrival Time");
        model.addColumn("Aircraft");
        model.addColumn("Description");
        Object[][] data = databaseHandler.select("flight", "flightId,flightNumber,originCityId,destinationCityId,departureTime,arrivalTime,aircraftId,description", null);
        
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
    
    public ArrayList<Flight> getCountriesList(){
        ArrayList<Flight> list = new ArrayList<>();
        Object[][] data = databaseHandler.select("flight", "flightId,flightNumber", null);
        for (Object[] row : data) {
            list.add(new Flight( Integer.parseInt((String) row[0]), (String) row[1]));
        }
        return list;
    }
    
    
    public boolean newFlight(String flightNumber, int originCityId, int destinationCityId, Date departureTime, Date arrivalTime, Aircraft aircraft){
        return databaseHandler.insert("flight", "flightNumber, originCityId, destinationCityId, departureTime, arrivalTime, aircraftId", "'"+flightNumber+"','"+originCityId+"','"+destinationCityId+"','"+departureTime+"','"+arrivalTime+"','"+aircraft.getAircraftId()+"'");
    }
    
    public boolean updateFlight(String flightNumber, int originCityId, int destinationCityId, Date departureTime, Date arrivalTime, Aircraft aircraft){
        return databaseHandler.update("flight", "flightNumber = '"+flightNumber+"', originCityId = '"+originCityId+"', destinationCityId = '"+destinationCityId+"', departureTime = '"+departureTime+"', arrivalTime = '"+arrivalTime+"'", "flightNumber = " + flightNumber);
    }

    public boolean updateCancelFlight(int flightId,String description){
        return databaseHandler.update("flight", "DESCRIPTION  = '"+description+"'"," flightId = "+flightId);
    }
    
    public boolean deleteFlight(int flightId){
        return databaseHandler.delete("flight", "flightId = " + flightId);
    }
}
