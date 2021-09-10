/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.kodigo.project1.group2.models.ExcelData;
import org.kodigo.project1.group2.models.ExcelDataTableModel;

/**
 *
 * @author JoseM
 */
public class ExcelController {
    private List<ExcelData> data = new ArrayList<>();
    
    /**
     * 
     * @param file
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws InvalidFormatException 
     */
    public List<ExcelData> retrieveDataFromFile(File file) throws FileNotFoundException, IOException, InvalidFormatException{
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
                
        for(Row row : sheet){
            if(row.getRowNum() != 0){
                String flightNumber = "";
                switch(row.getCell(0).getCellType().name()){
                    case "STRING" :   flightNumber = row.getCell(0).getStringCellValue(); break;
                    case "NUMERIC" :  flightNumber = String.valueOf(row.getCell(0).getNumericCellValue()); break;
                }
                String airline = row.getCell(1).getStringCellValue();
                String aircraft = row.getCell(2).getStringCellValue();
                String originCountry = row.getCell(3).getStringCellValue();
                String originCity = row.getCell(4).getStringCellValue();
                String destinationCountry = row.getCell(5).getStringCellValue();
                String destinationCity = row.getCell(6).getStringCellValue();
                Date departureTime = row.getCell(7).getDateCellValue();            
                Date arrivalTime = row.getCell(8).getDateCellValue();

            
                data.add(new ExcelData(flightNumber, airline, aircraft, originCountry, originCity, destinationCountry, destinationCity, departureTime, arrivalTime));
            }
        }
        
        return this.data;
    }
    
    public TableModel getTableFromFile(File file) throws InvalidFormatException, IOException{
        List<ExcelData> data = retrieveDataFromFile(file);
        return new ExcelDataTableModel(data);
    }
}
