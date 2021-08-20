/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.kodigo.project1.group2.models.WeatherApi;

/**
 *
 * @author JoseM
 */
public class WeatherController {
    private WeatherApi weatherApi = new WeatherApi();
    
    public String getWeatherConditions(String country, String city) throws MalformedURLException, IOException{
        String urlString = weatherApi.getAPI_URL()+"/data/2.5/weather?q="+city+","+country+"&APPID="+weatherApi.getAPI_KEY()+"&units=metric";
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        
        return content.toString();
        
        
    }
}
