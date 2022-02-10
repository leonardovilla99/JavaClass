/*
Write a program that prompts the user to enter a number within the range of 1 through 5. 
The program should display the Roman numeral version of that number. If the number is 
outside the range of 1 through 10, the program should display an error message.
*/

import java.util.Scanner;

public class RomanNumerals {    
    public static void main(String[] args) {

        int number, dec = 0;
        String i = "I", x = "X";
        
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Insert a number from 1 to 100: ");
            number = keyboard.nextInt();
        

            while(number >= 0){
                dec += 1;
                number -= 10;
            }
            dec -= 1;
            number += 10;

            if(number <= 100 && number >= 0){

                if(number < 4){
                    System.out.println("Your number in Roman Number is: " + x.repeat(dec) + i.repeat(number));
                }else if(number == 4){
                    System.out.println("Your number in Roman Number is: " + x.repeat(dec) +"IV");
                }else{
                    System.out.println("Your number in Roman Number is: "+ x.repeat(dec) +"V"+ i.repeat(number - 5));
                }
                    
            }else{
                System.out.println("Wrong number insert... type a number between 1 and 100");
            }
        }
    }
}
