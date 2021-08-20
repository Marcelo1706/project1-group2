/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import java.util.ArrayList;
import org.kodigo.project1.group2.models.Country;
import org.kodigo.project1.group2.models.Database;
import org.kodigo.project1.group2.utils.ComboItem;

/**
 *
 * @author JoseM
 */
public class CityController {
    private CountryController countryController = new CountryController();
    private Database databaseHandler;

    public CityController() {
        this.databaseHandler = new Database();
    }
    
    public ArrayList<ComboItem> loadCountriesComboItem(){
        ArrayList<ComboItem> comboItems = new ArrayList<>();
        ArrayList<Country> countryList = countryController.getCountriesList();
        countryList.forEach((country) -> {
            comboItems.add(new ComboItem(country.getCountryName(), String.valueOf(country.getCountryId())));
        });
        
        return comboItems;
    } 
}
