/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.models;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rene
 */
public class FlightLog extends Flight {
    @Getter @Setter private int FlightLogId;
    @Getter @Setter private String flightLog;

    public FlightLog(int FlightId,String flightNumber,int FlightLogId, String flightLog ) {
        super(FlightId,flightNumber)
        this.FlightLogId = FlightLogId;
        this.flightLog = flightLog;
    }
    
   