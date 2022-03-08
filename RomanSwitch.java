import java.util.Scanner;

public class RomanSwitch {
    public static void main(String[] args) {

        // Variable initialization
        int number;

        try (// Scanner initialization
        Scanner keyboard = new Scanner(System.in)) {
            // Ask user for number
            System.out.println("Insert a number from 1 to 5: ");
            number = keyboard.nextInt();
        }

        // Find equivalent and print it
        switch(number){
            case 1: 
                System.out.println("The number " + number + " converted into Roman number is: I"); 
                break;
            case 2: 
                System.out.println("The number " + number + " converted into Roman number is: II"); 
                break;
            case 3: 
                System.out.println("The number " + number + " converted into Roman number is: III"); 
                break;
            case 4: 
                System.out.println("The number " + number + " converted into Roman number is: IV"); 
                break;
            case 5: 
                System.out.println("The number " + number + " converted into Roman number is: V"); 
                break;
            default: 
                System.out.println("The number that you used can't be converted in Roman number");
                break;
        }
    }
}
