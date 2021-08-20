/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import org.kodigo.project1.group2.models.Database;


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
}
