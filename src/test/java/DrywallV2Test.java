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
public class DrywallV2Test {
    
    public DrywallV2Test() {
    }

    @Test
    public void testCalculateSquareFootage() {
        System.out.println("calculateSquareFootage");
        double len = 10.0;
        double wid = 10.0;
        double expResult = 100.0;
        double result = DrywallV2.calculateSquareFootage(len, wid);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateSquareFootage_IfNegativeLenWidth_Return0() {
        System.out.println("calculateSquareFootage");
        double len = -1;
        double wid = -1;
        double expResult = 0;
        double result = DrywallV2.calculateSquareFootage(len, wid);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalculateDrywallCostPerSquareFoot() {
        System.out.println("calculateDrywallCostPerSquareFoot");
        double quotedSqFootage = 48.0;
        double quotedAmount = 16.0;
        double expResult = 3.0;
        double result = DrywallV2.calculateDrywallCostPerSquareFoot(quotedSqFootage, quotedAmount);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateDrywallCostPerSquareFoot_zeroDenominator_returns0() {
        System.out.println("calculateDrywallCostPerSquareFoot");
        double quotedSqFootage = 48.0;
        double quotedAmount = 0;
        double expResult = 0;
        double result = DrywallV2.calculateDrywallCostPerSquareFoot(quotedSqFootage, quotedAmount);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateDrywallCostPerSquareFoot_negativeNumbers_returns0() {
        System.out.println("calculateDrywallCostPerSquareFoot");
        double quotedSqFootage = -1;
        double quotedAmount = -1;
        double expResult = 0;
        double result = DrywallV2.calculateDrywallCostPerSquareFoot(quotedSqFootage, quotedAmount);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalculateTotalCostOfDrywall() {
        System.out.println("calculateTotalCostOfDrywall");
        double drywallCostPerSqFoot = 3.0;
        double sqFootage = 100;
        double expResult = 300.0;
        double result = DrywallV2.calculateTotalCostOfDrywall(drywallCostPerSqFoot, sqFootage);
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testCalculateTotalCostOfDrywall_negative_returns0() {
        System.out.println("calculateTotalCostOfDrywall");
        double drywallCostPerSqFoot = -3.0;
        double sqFootage = -100;
        double expResult = 0;
        double result = DrywallV2.calculateTotalCostOfDrywall(drywallCostPerSqFoot, sqFootage);
        assertEquals(expResult, result, 0.0);
    }

     @Test
    public void testApplyTaxMarkup_taxCredit() {
        System.out.println("applyTaxMarkup");
        double amount = 300.0;
        double taxRate = -0.095;
        double expResult = 271.5;
        double result = DrywallV2.applyTaxMarkup(amount, taxRate);
        assertEquals(expResult, result, 0.0);
    }
    
      @Test
    public void testApplyTaxMarkup_negativeAmount() {
        System.out.println("applyTaxMarkup");
        double amount = -300.0;
        double taxRate = 0.095;
        double expResult = 0;
        double result = DrywallV2.applyTaxMarkup(amount, taxRate);
        assertEquals(expResult, result, 0.0);
    }
    
    
    @Test
    public void testApplyTaxMarkup() {
        System.out.println("applyTaxMarkup");
        double amount = 300.0;
        double taxRate = 0.095;
        double expResult = 328.5;
        double result = DrywallV2.applyTaxMarkup(amount, taxRate);
        assertEquals(expResult, result, 0.0);
    }
    
}
