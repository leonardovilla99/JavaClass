package Midterm;
/*
Mass and Weight

Scientists measure an object’s mass in kilograms and its weight in Newtons. 
If you know the amount of mass that an object has, you can calculate its weight, 
in Newtons, with the following formula:

Weight = Mass x 9.8

Write a program that asks the user to enter an object’s mass, and then calculate its weight. 
If the object weighs more than 1,000 Newtons, display a message indicating that it is too heavy. 
If the object weighs less than 10 Newtons, display a message indicating that the object is too light.
*/

import java.util.Scanner;

public class MassAndWeight {
    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner(System.in)) {
            // Variable
            Double mass, weight;
            final Double MASSNEWTONS = 9.8;

            // Ask for the mass
            System.out.println("Insert the mass(in kg): ");
            mass = keyboard.nextDouble();

            // Calculate Weight
            weight = mass * MASSNEWTONS;

            // Determinate if too heavy or too light
            if(weight > 1000.0){
                System.out.println("The object is too heavy");
            }else if(weight < 10.0){
                System.out.println("The object is too light");
            }else{
                System.out.println("The object normal");
            }
        }
        
    }
}
