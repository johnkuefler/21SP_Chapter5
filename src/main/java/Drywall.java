
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Drywall {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter length of space: ");
        double length = keyboard.nextDouble();
        
        System.out.println("Enter width of space: ");
        double width = keyboard.nextDouble();
     
        double sqFootage = length * width;
        
        System.out.println("Square footage is: " + sqFootage);
        
        System.out.println("Enter drywall quote square footage: ");
        double quoteSqFt = keyboard.nextDouble();
  
        System.out.println("Enter drywall quote dollar amount: ");
        double quoteDollarAmount = keyboard.nextDouble();
        
        double drywallCostPerSqFoot = quoteSqFt/quoteDollarAmount;
        
        System.out.println("Drywall will be " + drywallCostPerSqFoot);
        
        double drywallTotalCost = drywallCostPerSqFoot * sqFootage;
        
        System.out.println("Drywall cost before tax will be " + drywallTotalCost);
        
        final double TAX_RATE = 0.095;
        double afterTaxCost = drywallTotalCost * (1+TAX_RATE);
        
        System.out.println("Drywall cost after tax will be " + afterTaxCost);

    }
}
