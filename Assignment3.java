/*
Given three values of miles(10,15,20). 
Make a program that assign this values to variables and calculate 
and then print the equivalent in kilometers of those values

Use the following conversion rule 1 mile is 1.609 kilometers
*/

public class Assignment3 {
    
    public static void main(String[] args){

        // Assign variable and costant
        double miles1 = 10, miles2 = 15, miles3 = 20;
        double miles1Conversion,miles2Conversion,miles3Conversion;
        final double MILES_TO_KILOMETERS = 1.609;

        // Calculate kilometers
        miles1Conversion = miles1 * MILES_TO_KILOMETERS;
        miles2Conversion = miles2 * MILES_TO_KILOMETERS;
        miles3Conversion = miles3 * MILES_TO_KILOMETERS;

        // Print value
        System.out.println(miles1 + " miles are " + miles1Conversion + " km");
        System.out.println(miles2 + " miles are " + miles2Conversion + " km");
        System.out.println(miles3 + " miles are " + miles3Conversion + " km");

        int x = 15, y = 20, z= 32;
        x+= 12;
        y /= 6;
        z -=14;
        System.out.println(x + " " + y + " " + z);

    }

}
