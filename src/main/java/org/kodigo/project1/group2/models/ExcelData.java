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
public class ExcelData {
    @Getter @Setter private String flightNumber;
    @Getter @Setter private String airline;
    @Getter @Setter private String aircraft;
    @Getter @Setter private String originCountry;
    @Getter @Setter private String originCity;
    @Getter @Setter private String destinationCountry;
    @Getter @Setter private String destinationCity;
    @Getter @Setter private Date departureTime;
    @Getter @Setter private Date arrivalTime;
}
