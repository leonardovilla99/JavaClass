package Midterm;
/*
A bank charges a base fee of $10 per month, plus the following check fees for commercial checking account:

    $0.10 each for less than 20 checks
    $0.08 each for 20-39 checks
    $0.06 each for 40-59 checks
    $0.04 each for 60 or more checks

Write a program that asks for the number of checks written for the monrth. 
The program should then calculate and display the bank's service fees for the month.
*/
import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {
        
        try (Scanner keyboard = new Scanner(System.in)) {
            // Variables
            final Double BASEFEE = 10.0;
            int numberOfChecks;
            Double totalServiceFee, fee = 0.0;

            // Ask for number of checks
            System.out.println("Insert the number of checks: ");
            numberOfChecks = keyboard.nextInt();

            // Calculate price
            if(numberOfChecks < 0){
                System.out.println("Invalid number insert!");
            }else{
                if(numberOfChecks < 40){
                    if(numberOfChecks < 20){
                        fee = 0.10;
                    }else{
                        fee = 0.08;
                    }
                }else{
                    if(numberOfChecks < 60){
                        fee = 0.06;
                    }else{
                        fee = 0.04;
                    }
                }

                totalServiceFee = BASEFEE + (numberOfChecks * fee);
                
                // Display total fee
                System.out.println("Your total fee is: "+ totalServiceFee);

            }
        } 
    }
}
