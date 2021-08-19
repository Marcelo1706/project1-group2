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
public class Aircraft {
    @Getter @Setter private int aircraftId;
    @Getter @Setter private String model;
    @Getter @Setter private int passengerCapacity;
    @Getter @Setter private double fuelRange;
    @Getter @Setter private Airline airline;

    public Aircraft(int aircraftId, String model, int passengerCapacity, double fuelRange, Airline airline) {
        this.aircraftId = aircraftId;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.fuelRange = fuelRange;
        this.airline = airline;
    }
    
}
