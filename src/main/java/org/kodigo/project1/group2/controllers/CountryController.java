/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import javax.swing.table.DefaultTableModel;
import lombok.Getter;
import lombok.Setter;
import org.kodigo.project1.group2.models.Country;
import org.kodigo.project1.group2.models.Database;

/**
 *
 * @author JoseM
 */
public class CountryController {
    @Getter @Setter private Country singleCountry;
    @Getter @Setter private Database databaseHandler;
    
    public CountryController(){
        this.databaseHandler = new Database();
    }
    
    public DefaultTableModel getCountries(){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("ID");        
        model.addColumn("Country");
        Object[][] data = databaseHandler.select("country", "countryId,countryName", null);
               
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
    
    public boolean newCountry(String countryName){
        return databaseHandler.insert("country", "countryName", "'"+countryName+"'");
    }
    
    public boolean deleteCountry(int countryId){
        return databaseHandler.delete("country", "countryId = "+countryId);
    }
}