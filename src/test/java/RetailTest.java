/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author johnk
 */
public class RetailTest {
    
    public RetailTest() {
    }

    @Test
    public void testCalculateRetail() {
        System.out.println("calculateRetail");
        double wholesaleCost = 5;
        double markupPercent = 1;
        double expResult = 10;
        double result = Retail.calculateRetail(wholesaleCost, markupPercent);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateRetail2() {
        System.out.println("calculateRetail");
        double wholesaleCost = 5;
        double markupPercent = 0.5;
        double expResult = 7.5;
        double result = Retail.calculateRetail(wholesaleCost, markupPercent);
        assertEquals(expResult, result, 0.0);
    }
}
