/*
A car’s miles-per-gallon (MPG) can be calculated with the following formula:

MPG = Miles driven / Gallons of gas used

Write a program that asks the user for the number of miles driven and the gallons of gas used. 
It should calculate the car’s miles-per-gallon and display the result on the screen.
*/

import javax.swing.*;

public class MilesPerGallon {
    public static void main(String[] args) {

        double numberOfMiles, numberOfGallons, milesPerGallon;

        // Ask user for number of miles
        numberOfMiles = Double.parseDouble(JOptionPane.showInputDialog("Number of miles: "));

        // Ask user for number of gallons
        numberOfGallons = Double.parseDouble(JOptionPane.showInputDialog("Number of gallon: "));

        // Calculate MPG
        milesPerGallon = numberOfMiles / numberOfGallons;

        // Print MPG
        JOptionPane.showMessageDialog(null, "mpg= " + milesPerGallon);

    }
}
