/*
Write a program that will ask the user to enter the amount of a purchase. 
The program should then compute the state and county sales tax. Assume the 
state sales tax is 4 percent and the county sales tax is 2 percent. 
The program should display the amount of the purchase, the state sales tax, 
the county sales tax, the total sales tax, and the total of the sale 
(which is the sum of the amount of purchase plus the total sales tax).

Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent.
*/
import java.util.Scanner;

public class SaleTax {
    public static void main(String[] args) {

        final double STATE_TAX_RATIO = 0.04, COUNTRY_TAX_RATIO = 0.02;
        double stateSaleTax, countrySaleTax, totalSaleTax, totalSale, purchaseAmount;

        try (Scanner keyboard = new Scanner(System.in)) {

            // Ask user for amount of purchase
            System.out.println("What is the amount of your purchase? ");
            purchaseAmount = keyboard.nextDouble();
        

            // Calculate stateSaleTax 
            stateSaleTax = purchaseAmount * STATE_TAX_RATIO;

            // Calculate countrySaleTax
            countrySaleTax = purchaseAmount * COUNTRY_TAX_RATIO;

            // Calculate totalSaleTax
            totalSaleTax = stateSaleTax + countrySaleTax;

            // Calculate totalSale
            totalSale = purchaseAmount + totalSaleTax;

            // Printing everithing
            System.out.println("Your amount of pourcharse is: $" + purchaseAmount);
            System.out.println("Your state taxes are: $" + stateSaleTax);
            System.out.println("Your country taxes are: $" + countrySaleTax);
            System.out.println("Your total taxes are: $" + totalSaleTax);
            System.out.println("Your total is: $" + totalSale);

        }

    }
}
