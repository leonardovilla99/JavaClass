/*
Implement the  method named getDistance with the following header:

public static double getDistance(double speed, double time)

Given speed and time should return the distance traveled(assume distance=speed*time
*/

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            // Variable
            double speed,time,distance;

            // Ask for speed and time
            System.out.println("At what speed you were traveling(m/h)? ");
            speed = keyboard.nextDouble();

            System.out.println("For how long you were traveling (hours)? ");
            time = keyboard.nextDouble();

            // Call method
            distance = getDistance(speed, time);
        

        // Print distance
        System.out.println("You traveled for " + distance + " miles");
        }
    };

    // Calculate distance
    public static double getDistance(double speed, double time){
        return speed*time;
    }
}