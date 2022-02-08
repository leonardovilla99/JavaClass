/*
One acre of land is equivalent to 43,560 square feet. Write a program that 
calculates the number of acres in a tract of land with 389,767 square feet. 
Hint: Divide the size of the tract of land by the size of an acre to get the number of acres.
*/

public class LandCalculation {

    public static void main(String[] args){

        // Variables
        final double SQUARE_TO_ACRE = 43560;
        double squareFeet = 389767;
        double acre;

        // Calculating
        acre = squareFeet / SQUARE_TO_ACRE;

        // Print out
        System.out.println("The number of acre in " + squareFeet + " square feet are: " + acre);
        
        
    }

}