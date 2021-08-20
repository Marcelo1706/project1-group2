/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import java.util.ArrayList;
import org.kodigo.project1.group2.models.City;
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
    
    public ArrayList<City> getCitiesList(){
        ArrayList<City> list = new ArrayList<>();
        Object[][] data = databaseHandler.select("city", "cityId,cityName", null);
        for (Object[] row : data) {
            list.add(new City( Integer.parseInt((String) row[0]), (String) row[1]));
        }
        return list;
    }
    
    public ArrayList<ComboItem> loadCitiesComboItem(){
        ArrayList<ComboItem> comboItems = new ArrayList<>();
        ArrayList<City> cityList = getCitiesList();
        cityList.forEach((country) -> {
            comboItems.add(new ComboItem(country.getCityName(), String.valueOf(country.getCityId())));
        });
        
        return comboItems;
    } 
}
