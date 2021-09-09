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
import org.kodigo.project1.group2.models.Airline;
import org.kodigo.project1.group2.models.Database;

/**
 *
 * @author Néstor Recinos
 */
public class AirlineController {
    @Getter @Setter private Airline singleAirline;
    @Getter @Setter private Database databaseHandler;
    
    public AirlineController(){
        this.databaseHandler = new Database();
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Airline> getAirlinesList(){
        ArrayList<Airline> list = new ArrayList<>();
        Object[][] data = databaseHandler.select("airline", "airlineId,airlineName", null);
        for (Object[] row : data) {
            list.add(new Airline( Integer.parseInt((String) row[0]), (String) row[1]));
        }
        return list;
    }

    /**
     * 
     * @return 
     */
    public DefaultTableModel getAirlinesTable(){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("ID");        
        model.addColumn("Airline");
        Object[][] data = databaseHandler.select("airline", "airlineId,airlineName", null);
               
        for (Object[] dataRow : data) {
            model.addRow(dataRow);
        }
        return model;
    }
   /**
    * 
    * @param airlineName
    * @return 
    */ 
   public boolean newAirline(String airlineName){
       return databaseHandler.insert("airline", "airlineName", "'"+airlineName+"'");
   }
   
   /**
    * 
    * @param id
    * @param airlineName
    * @return 
    */
   public boolean updateAirline(int id, String airlineName){
       return databaseHandler.update("airline", "airlineName = '" +airlineName+"'", "airlineId = " + id);
   }
   
   /**
    * 
    * @param id
    * @return 
    */
   public boolean deleteAirline(int id){
       return databaseHandler.delete("airline", "airlineId = " + id);
   }
}
