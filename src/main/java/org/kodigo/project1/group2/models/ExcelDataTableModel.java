/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.models;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author JoseM
 */
public class ExcelDataTableModel extends AbstractTableModel {

    private final List<ExcelData> data;
    private final String[] columns;
    
    public ExcelDataTableModel(List<ExcelData> dataList){
        super();
        data = dataList;
        columns = new String[] {"Flight Number", "Airline", "Aircraft", "Origin Country", "Origin City", "Destination Country", "Destination City", "Departure Time", "Arrival Time"};
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        ExcelData excelData = data.get(row);
        switch(col){
            case 0: return excelData.getFlightNumber();
            case 1: return excelData.getAirline();
            case 2: return excelData.getAircraft();
            case 3: return excelData.getOriginCountry();
            case 4: return excelData.getOriginCity();
            case 5: return excelData.getDestinationCountry();
            case 6: return excelData.getDestinationCity();
            case 7: return excelData.getDepartureTime();
            case 8: return excelData.getArrivalTime();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int col){
        return columns[col];
    }
    
    
}
