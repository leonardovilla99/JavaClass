import java.util.Scanner;

public class Rainfall {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Variable
        int numOfYears, totalMonths;
        double mounthRainfall, totalRainfall = 0, avarageRainfall;
        
        // Ask user for the number of years in the study
        System.out.println("Number of years in the study: ");
        numOfYears = keyboard.nextInt();

        // For each years
        for(int years = 1; years <= numOfYears; years++){
            // For each months
            for(int months = 1; months <= 12; months ++){
                
                System.out.println("Enter the rainfall corresponding to "+ years + "/" + months +": ");
                mounthRainfall = keyboard.nextDouble();

                totalRainfall = totalRainfall + mounthRainfall;
            }
        }

        totalMonths = numOfYears * 12;

        // Calculate the average monthly rainfall
        avarageRainfall = totalRainfall / totalMonths;

        // Number of months
        System.out.println("Number of months: " + totalMonths);

        // Print the total inches of rainfall
        System.out.println("The total inches of rainfall is: " + totalRainfall);

        // Print the avarage inches of rainfall
        System.out.println("The avarage inches of rainfall is: " + avarageRainfall);

    }
}
