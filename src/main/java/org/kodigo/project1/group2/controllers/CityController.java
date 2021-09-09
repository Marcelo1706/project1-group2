/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.kodigo.project1.group2.models.City;
import org.kodigo.project1.group2.models.Country;
import org.kodigo.project1.group2.models.Database;
import org.kodigo.project1.group2.utils.ComboItem;

/**
 *
 * @author JoseM
 */
public class CityController {
    private Database databaseHandler;

    public CityController() {
        this.databaseHandler = new Database();
    }
    
    /**
     * 
     * @return 
     */
    public DefaultTableModel getCitiesTable(){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("ID");        
        model.addColumn("City");
        Object[][] data = databaseHandler.select("city", "cityId,cityName", null);
               
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<City> getCitiesList(){
        ArrayList<City> list = new ArrayList<>();
        Object[][] data = databaseHandler.select("city", "cityId,cityName", null);
        for (Object[] row : data) {
            list.add(new City( Integer.parseInt((String) row[0]), (String) row[1]));
        }
        return list;
    }
    /**
     * 
     * @return 
     */
    public ArrayList<ComboItem> loadCitiesComboItem(){
        ArrayList<ComboItem> comboItems = new ArrayList<>();
        ArrayList<City> cityList = getCitiesList();
        cityList.forEach((country) -> {
            comboItems.add(new ComboItem(country.getCityName(), String.valueOf(country.getCityId())));
        });
        
        return comboItems;
    }
    
    /**
     * 
     * @param country
     * @return 
     */
    public ArrayList<ComboItem> loadCitiesFromCertainCountry(String country){
        ArrayList<City> list = new ArrayList<>();
        ArrayList<ComboItem> comboItems = new ArrayList<>();
        
        Object[][] data = databaseHandler.select("city", "cityId,cityName", " countryId = (SELECT countryId FROM country WHERE countryName = '"+country+"') ");
        for (Object[] row : data) {
            list.add(new City( Integer.parseInt((String) row[0]), (String) row[1]));
        }
        
        list.forEach((city) -> {
            comboItems.add(new ComboItem(city.getCityName(), String.valueOf(city.getCityId())));
        });
        
        return comboItems;
    }
    /**
     * 
     * @param cityName
     * @param countryId
     * @return 
     */
    public boolean newCity(String cityName, int countryId){
        return databaseHandler.insert("city", "cityName, countryId, latitude, longitude", "'"+cityName+"','"+countryId+"',0,0");
    }
    
    /**
     * 
     * @param cityId
     * @return 
     */
    public boolean deleteCity(int cityId){
        return databaseHandler.delete("city", "cityId = "+cityId);
    }
}
