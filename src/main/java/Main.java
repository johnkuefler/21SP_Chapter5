
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WDAGUtilityAccount
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter miles driven");
        double miles = keyboard.nextDouble();
        
        System.out.println("Enter gallons of gas used");
        double gallons = keyboard.nextDouble();
        
        double mpg = calculateMPG(miles, gallons);
        
        System.out.println("Your MPG was " + mpg);
    }
    
    public static int addNumbers(int x, int y) {
        return x+y;
    }
    
    public static double calculateMPG(double milesDriven, double gallonsOfGas)
    {
        if (milesDriven < 0 || gallonsOfGas <= 0) {
            return 0;
        }
        
        double result = milesDriven/gallonsOfGas;
        return result;
    }
}
