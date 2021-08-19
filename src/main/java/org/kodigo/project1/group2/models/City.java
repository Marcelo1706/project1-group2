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
public class City {
    @Getter @Setter private int cityId;
    @Getter @Setter private String cityName;
    @Getter @Setter private double latitude;
    @Getter @Setter private double longitude;
    @Getter @Setter private Country country;

    public City(int cityId, String cityName, double latitude, double longitude, Country country) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
    }
    
}
