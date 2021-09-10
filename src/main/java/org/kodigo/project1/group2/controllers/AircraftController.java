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
import org.kodigo.project1.group2.models.Aircraft;
import org.kodigo.project1.group2.models.Airline;
import org.kodigo.project1.group2.models.Database;

/**
 *
 * @author Néstor Recinos
 */
public class AircraftController {
    @Getter @Setter private Aircraft singleCountry;
    @Getter @Setter private Database databaseHandler;
    
    public AircraftController(){
        this.databaseHandler = new Database();
    }
    /**
     * 
     * @return 
     */
    public ArrayList<Aircraft> getAircraftList(){
        ArrayList<Aircraft> list = new ArrayList<>();
        Object[][] data = databaseHandler.select("aircraft", "aircraftId, model", null);
        for (Object[] row : data) {
            list.add(new Aircraft(Integer.parseInt((String) row[0]), (String) row[1]));
        }
        return list;
    }
    
    /**
     * 
     * @return 
     */
    public DefaultTableModel getAircraftTable(){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("ID");
        model.addColumn("Model");
        model.addColumn("Passenger Capacity");
        model.addColumn("Fuel Range");
        model.addColumn("Airline");
        Object[][] data = databaseHandler.select("aircraft", "aircraftId, model, passengerCapacity, fuelRange, airlineId", null);
               
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
    /**
     * 
     * @param model
     * @param passengerCapacity
     * @param fuelRange
     * @param airline
     * @return 
     */
    public boolean newAircraft(String model, int passengerCapacity, double fuelRange, Airline airline){
        return databaseHandler.insert("aircraft", "model, passengerCapacity, fuelRange, airlineId", "'"+model+"','"+passengerCapacity+"','"+fuelRange+"','"+airline.getAirlineId()+"'");
    }
    /**
     * 
     * @param id
     * @param model
     * @param passengerCapacity
     * @param fuelRange
     * @param airline
     * @return 
     */
    public boolean updateAircraft(int id, String model, int passengerCapacity, double fuelRange, Airline airline){
        return databaseHandler.update("aircraft", "model = '"+model+"', passengerCapacity = '"+passengerCapacity+"', fuelRange = '"+fuelRange+"', airlineId = '"+airline.getAirlineId()+"'", "aircraftId = " + id);
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public boolean deleteAircraft(int id){
        return databaseHandler.delete("aircraft", "aircraftId = " + id);
    }
}
