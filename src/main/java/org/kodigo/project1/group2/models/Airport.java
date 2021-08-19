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
public class Airport {
    @Getter @Setter private int airportId;
    @Getter @Setter private String airportName;
    @Getter @Setter private City airportLocation;

    public Airport(int airportId, String airportName, City airportLocation) {
        this.airportId = airportId;
        this.airportName = airportName;
        this.airportLocation = airportLocation;
    }
    
    
}
