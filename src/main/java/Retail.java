
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
public class Retail {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter wholesale cost: ");
        double wholesale = keyboard.nextDouble();
        
        System.out.println("Enter markup percentage as a decimal: ");
        double markupPercent = keyboard.nextDouble();
        
        double retailCost = calculateRetail(wholesale, markupPercent);
        
        System.out.println("Retail cost is: " + retailCost);
    }
    
    // we will assume, markup percent is in decimal form
    public static double calculateRetail(double wholesaleCost, double markupPercent) {  
        double retailCost = wholesaleCost * (1 + markupPercent);
        
        return retailCost;
    }
}
