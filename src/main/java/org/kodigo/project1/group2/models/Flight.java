/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.models;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author JoseM
 */
public class Flight {
    @Getter @Setter private int flightId; 
    @Getter @Setter private String flightNumber;
    @Getter @Setter private City originCity;
    @Getter @Setter private City destinationCity;
    @Getter @Setter private Date departureTime;
    @Getter @Setter private Date arrivalTime; 
    @Getter @Setter private Aircraft aircraft;

    public Flight(int flightId, String flightNumber, City originCity, City destinationCity, Date departureTime, Date arrivalTime, Aircraft aircraft) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
    }
    
    public Flight(int flightId){
        this.flightId = flightId;
    }
    
    public Flight(int flightId, String flightNumber){
        this.flightId = flightId;
        this.flightNumber = flightNumber;
    }
    
    
        
}
