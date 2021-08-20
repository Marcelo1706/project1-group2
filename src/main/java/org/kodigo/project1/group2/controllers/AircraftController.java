/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

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
    
    public boolean newAircraft(String model, int passengerCapacity, double fuelRange, Airline airline){
        return databaseHandler.insert("aircraft", "model, passengerCapacity, fuelRange, airline", "'"+model+"','"+passengerCapacity+"','"+fuelRange+"','"+airline.getAirlineId()+"'");
    }
    
    public boolean updateAircraft(int id, String model, int passengerCapacity, double fuelRange, Airline airline){
        return databaseHandler.update("aircraft", "model = '"+model+"', passengerCapacity = '"+passengerCapacity+"', fuelRange = '"+fuelRange+"', airline = '"+airline.getAirlineId()+"'", "aircraftId = " + id);
    }
    
    public boolean deleteAircraft(int id){
        return databaseHandler.delete("aircraft", "aircraftId = " + id);
    }
}
