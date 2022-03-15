/*
At BC Bank you can start an investment account at the beginning of the year. 
At the end of the year you would get back your money plus an interest based 
on the amount of money you invested.

The minimum investment is $20,000
Make a program that asks the user for the amount to invest and prints back 
the user how much the bank is going to give the person back: investment plus interest. 
If the investment is below minimum, it should be noted as not allowed.
*/

import java.util.Scanner;

public class midTerm {
    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner(System.in)) {
            // Initialize variable
            Double inv, interest, total;

            System.out.println("How much do you want to invest ($)?");
            inv = keyboard.nextDouble();

            // Calculate investment and total
            if(inv < 20000.0){
                System.out.println("The minimum investment is $20000.00");
            }else{
                if(inv < 100000.0){
                    if(inv < 50000.0){
                        interest = inv * 0.15;
                    }else{
                        interest = inv * 0.20;
                    }
                }else{
                    if(inv < 200000.0){
                        interest = inv * 0.25;
                    }else{
                        interest = inv * 0.30;
                    }
                }

                total = inv + interest;
                
                // Display
                System.out.println("After a year the bank is going to give you:");
                System.out.printf("Investment: $%.2f\n", inv);
                System.out.printf("Interest: $%.2f\n", interest);
                System.out.printf("Total: $%.2f\n", total);

            }
        }
    }
}
