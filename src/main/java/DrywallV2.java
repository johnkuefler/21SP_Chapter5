
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
public class DrywallV2 {

    public static void main(String[] args) {
        final double TAX_RATE = 0.095;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter length of space: ");
        double length = keyboard.nextDouble();

        System.out.println("Enter width of space: ");
        double width = keyboard.nextDouble();

        System.out.println("Enter drywall quote square footage: ");
        double quoteSqFt = keyboard.nextDouble();

        System.out.println("Enter drywall quote dollar amount: ");
        double quoteDollarAmount = keyboard.nextDouble();

        double sqFootage = calculateSquareFootage(length, width);
        double drywallCostPerSqFoot = calculateDrywallCostPerSquareFoot(quoteSqFt, quoteDollarAmount);
        double drywallTotalCost = calculateTotalCostOfDrywall(sqFootage, drywallCostPerSqFoot);
        double afterTaxCost = applyTaxMarkup(drywallTotalCost, TAX_RATE);

        System.out.println("Drywall cost after tax will be " + afterTaxCost);

    }

    public static double calculateSquareFootage(double len, double wid) {
        if (len < 0 || wid < 0) {
            return 0;
        }

        return len * wid;
    }

    public static double calculateDrywallCostPerSquareFoot(double quotedSqFootage, double quotedAmount) {
        if (quotedAmount <= 0 || quotedSqFootage < 0) {
            return 0;
        }

        return quotedSqFootage / quotedAmount;
    }

    public static double calculateTotalCostOfDrywall(double drywallCostPerSqFoot, double sqFootage) {
        if (drywallCostPerSqFoot < 0 || sqFootage < 0) {
            return 0;
        }

        return drywallCostPerSqFoot * sqFootage;
    }

    public static double applyTaxMarkup(double amount, double taxRate) {
        if (amount < 0) {
            return 0;
        }

        return amount * (1 + taxRate);
    }
}
