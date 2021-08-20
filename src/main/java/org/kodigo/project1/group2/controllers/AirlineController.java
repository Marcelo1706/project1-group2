/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import lombok.Getter;
import lombok.Setter;
import org.kodigo.project1.group2.models.Airline;
import org.kodigo.project1.group2.models.Database;

/**
 *
 * @author Néstor Recinos
 */
public class AirlineController {
    @Getter @Setter private Airline singleAirline;
    @Getter @Setter private Database databaseHandler;
    
    public AirlineController(){
        this.databaseHandler = new Database();
    }
    
   public boolean newAirline(String airlineName){
       return databaseHandler.insert("airline", "airlineName", "'"+airlineName+"'");
   }
   
   public boolean updateAirline(int id, String airlineName){
       return databaseHandler.update("airline", airlineName, airlineName);
   }
           
   public boolean deleteAirline(int id){
       return databaseHandler.delete("airline", "airlineId = " + id);
   }
}
