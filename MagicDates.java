/*
The date June 10, 1960, is special because when we write it in the following format, 
the month times the day equals the year:

6/10/60

Write a program that asks the user to enter a month (in numeric form), a day, and a two digit year. 
The program should then determine whether the month times the day is equal to the year. 
If so, it should display a message saying the date is magic. Otherwise, it should display a message 
saying the date is not magic.


*/

import java.util.Scanner;

public class MagicDates {
    public static void main(String[] args) {
        
        // Initialize variable
        int day,month,year;

        Scanner keyboard = new Scanner(System.in);

        // Ask for month
        System.out.println("Enter month in a digit format: ");
        month = keyboard.nextInt();

        // Ask for day
        System.out.println("Enter day: ");
        day = keyboard.nextInt();

        // Ask for year
        System.out.println("Enter year(2 digit format): ");
        year = keyboard.nextInt();

        // Show if the date is magic or not
        if(month * day == year)
            System.out.println("Date is magic");
        else
            System.out.println("Date is not magic");
    }
}
