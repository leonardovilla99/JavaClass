/*

*/
import java.util.Scanner;
import javax.swing.*;

public class practiceString {

    public static void main(String[] args){

        try (Scanner keyboard = new Scanner(System.in)) {

            String name = JOptionPane.showInputDialog("Choose a name: ");
            
            // System.out.println("Chose a name: ");
            // String name = keyboard.nextLine(); // Using nextLine method to get one line of text

            // System.out.println("How old is " + name + "?: ");
            // int age = keyboard.nextInt();
            JOptionPane.showMessageDialog(null, "Let's show it as " + name.toUpperCase());
            System.out.println("This name contain " + name.length() + " character");
            System.out.println("Let's show it as " + name.toUpperCase());
            // System.out.println("He is " + age + " years old");

        }
        
    }

}