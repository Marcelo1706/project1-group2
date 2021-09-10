/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.test;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;
import org.kodigo.project1.group2.controllers.ExcelController;

/**
 *
 * @author JoseM
 */
public class ExcelTest {
    
    private File fileTest = new File("D:\\Descargas\\Flights.xlsx");
    private ExcelController excelController = new ExcelController();
    public ExcelTest(){}
    
    @Test
    public void testColumnCount() throws InvalidFormatException, IOException{
        int columnCount = 9;
        Assert.assertEquals("The result is 9",columnCount,excelController.getTableFromFile(fileTest).getColumnCount());
        
    }
    
    @Test 
    public void testRowCount() throws InvalidFormatException, IOException {
        int columnCount = 5;
        Assert.assertEquals("The result is 9",columnCount,excelController.getTableFromFile(fileTest).getRowCount());
    }
}
