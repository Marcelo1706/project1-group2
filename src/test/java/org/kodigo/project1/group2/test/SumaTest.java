package org.kodigo.project1.group2.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    public static void sumaTest(){
        int ans = 4;
        assertEquals(ans, sumar(2,2));
    }
    
}