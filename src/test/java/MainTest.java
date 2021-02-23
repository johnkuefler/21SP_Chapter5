/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author WDAGUtilityAccount
 */
public class MainTest {
    
    public MainTest() {
    }


    @Test
    public void testAddNumbersZeroes() {
        System.out.println("addNumbers");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = Main.addNumbers(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddNumbersPositiveWholeNumbers() {
        System.out.println("addNumbers");
        int x = 5;
        int y = 2;
        int expResult = 7;
        int result = Main.addNumbers(x, y);
        assertEquals(expResult, result);
    }


    @Test
    public void testCalculateMPG() {
        System.out.println("calculateMPG");
        double milesDriven = 100;
        double gallonsOfGas = 5;
        double expResult = 20;
        double result = Main.calculateMPG(milesDriven, gallonsOfGas);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateMPGNegativeValues() {
        System.out.println("calculateMPG");
        double milesDriven = -1;
        double gallonsOfGas = -1;
        double expResult = 0;
        double result = Main.calculateMPG(milesDriven, gallonsOfGas);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testCalculateMPGZeroGallons() {
        System.out.println("calculateMPG");
        double milesDriven = 100;
        double gallonsOfGas = 0;
        double expResult = 0;
        double result = Main.calculateMPG(milesDriven, gallonsOfGas);
        assertEquals(expResult, result, 0.0);
    }
}
