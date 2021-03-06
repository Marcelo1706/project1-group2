/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import lombok.Getter;
import lombok.Setter;
import org.kodigo.project1.group2.models.Country;
import org.kodigo.project1.group2.models.Database;
import org.kodigo.project1.group2.utils.ComboItem;

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
    
    /**
     * 
     * @return 
     */
    public ArrayList<Country> getCountriesList(){
        ArrayList<Country> list = new ArrayList<>();
        Object[][] data = databaseHandler.select("country", "countryId,countryName", null);
        for (Object[] row : data) {
            list.add(new Country( Integer.parseInt((String) row[0]), (String) row[1]));
        }
        return list;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<ComboItem> loadCountriesComboItem(){
        ArrayList<ComboItem> comboItems = new ArrayList<>();
        ArrayList<Country> countryList = getCountriesList();
        countryList.forEach((country) -> {
            comboItems.add(new ComboItem(country.getCountryName(), String.valueOf(country.getCountryId())));
        });
        
        return comboItems;
    }
    
    /**
     * 
     * @return 
     */
    public DefaultTableModel getCountriesTable(){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("ID");        
        model.addColumn("Country");
        Object[][] data = databaseHandler.select("country", "countryId,countryName", null);
               
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
    /**
     * 
     * @param countryName
     * @return 
     */
    public boolean newCountry(String countryName){
        return databaseHandler.insert("country", "countryName", "'"+countryName+"'");
    }
    /**
     * 
     * @param countryId
     * @return 
     */
    public boolean deleteCountry(int countryId){
        return databaseHandler.delete("country", "countryId = "+countryId);
    }
}
