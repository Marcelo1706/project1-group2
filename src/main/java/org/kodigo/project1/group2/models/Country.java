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
public class Country {
    @Getter @Setter private int countryId;
    @Getter @Setter private String countryName;

    public Country(int countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }
    
    
    
}
