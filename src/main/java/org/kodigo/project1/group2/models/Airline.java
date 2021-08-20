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
public class Airline {
    @Getter @Setter private int airlineId;
    @Getter @Setter private String airlineName;
    
    public Airline(int airlineId, String airlineName){
        this.airlineId = airlineId;
        this.airlineName = airlineName;
    }
}
