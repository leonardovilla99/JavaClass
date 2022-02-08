/*
Learning Outcome: This assignment allows you to show your ability to create 
code that receives input from the user, process that input with background 
knowledge to produce an answer back at the user.

I and my friends went to the BCMarket to buy some snacks for my friends' meeting. 
We decided to buy for each person 2 hotpockets and  3 soda cans. Your task is 
to make a program that ask me for the number of people that are going to be in the meeting. 
Ask the BCMarket employee how much it costs each hotpocket and how much it costs each soda can. 
Calculate the total amount to pay in hotpockets, total amount to pay in soda cans and the total to pay. 
Print these three numbers on the screen with a nice message. 
*/

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){

        // Initialize variable and constant
        final int HOTPOCKETS = 2, SODACAN = 3;
        int numberOfPeople;
        double pocketsPrice, canPrice, totalPocketsPrice, totalCanPrice, total;

        try (// Initialize scanner
        Scanner keyboard = new Scanner(System.in)) {
            // Prompting user
            System.out.println("How many people are going to be in your meeting?");
            numberOfPeople = keyboard.nextInt();

            System.out.println("How much does it cost a hotpocket?");
            pocketsPrice = keyboard.nextDouble();

            System.out.println("How much does it cost a soda can?");
            canPrice = keyboard.nextDouble();
        }

        // Calculate totalPocketsPrice and totalCanPrice
        totalPocketsPrice = HOTPOCKETS * numberOfPeople * pocketsPrice;
        totalCanPrice = SODACAN * numberOfPeople * canPrice;

        // Calculate total
        total = totalPocketsPrice + totalCanPrice;

        // Print results
        System.out.println("Hotpockets total $" + totalPocketsPrice);
        System.out.println("Soda total $" + totalCanPrice);
        System.out.println("Snacks total $" + total);

    }
}
