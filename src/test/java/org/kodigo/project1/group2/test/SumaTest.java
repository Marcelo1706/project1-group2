package org.kodigo.project1.group2.test;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Jaime Reyes
 */
public class SumaTest {
    
    public SumaTest() {
    }
    
    public static int sumar(int n1, int n2){
        
        return n1 + n2;
    }
    
    @Test
    public void testSuma(){
        int respuesta = 4;
        
        Assert.assertEquals("El resultado es 4", respuesta, sumar(2,2));
    }
 
}
