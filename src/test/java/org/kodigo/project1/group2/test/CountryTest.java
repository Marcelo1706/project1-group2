/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.project1.group2.test;

import junit.framework.TestCase;
import org.junit.Test;
import org.kodigo.project1.group2.controllers.CountryController;

/**
 *
 * @author Néstor Recinos
 */
public class CountryTest extends TestCase{
        private CountryController Country;
        
        public CountryController escenario(){
            return new CountryController();
        }
        
        @Test
        public void testAdd(){
            assertTrue(escenario().newCountry("Andorra"));
        }
}
