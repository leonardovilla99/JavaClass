/*
Make an array of 10 values of type int, set its elements to random values in the range 10-20 
and calculate the average of all those numbers(from the array). 
*/
import java.util.Random;

public class Assignment13 {
    public static void main(String[] args) {
        // Initialize random
        Random rng = new Random();

        // Create variable
        int[] array = new int[10];
        double avarage = 0.0;

        // Set random value between 10 and 20
        for(int i=0; i<array.length; i++){
            array[i] = rng.nextInt(10) + 11;

            // Add all number
            avarage += array[i];

            // Print all number
            System.out.println(array[i]);
        }

        // Calculate avarage
        avarage = avarage/10;

        // Print avarage
        System.out.println("Avarage: " + avarage); 
    }
}
