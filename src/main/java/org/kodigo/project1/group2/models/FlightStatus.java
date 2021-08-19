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
 * @author JoseM
 */
public class FlightStatus {
    @Getter @Setter private int flightStatusId;
    @Getter @Setter private String flightStatus;
    @Getter @Setter private String flightLog;
    @Getter @Setter private Flight flight;

    public FlightStatus(int flightStatusId, String flightStatus, String flightLog, Flight flight) {
        this.flightStatusId = flightStatusId;
        this.flightStatus = flightStatus;
        this.flightLog = flightLog;
        this.flight = flight;
    }
    
    
}
