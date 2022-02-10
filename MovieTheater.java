/*
A person in going to buy a ticket in a movie theater. The ticket cost $10 for general public,
but if the person is a senior citizen then it gets a 10% discount.
*/

import java.util.Scanner;

public class MovieTheater {
    public static void main(String[] args) {
        
        String answer;

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Are you a senior citizen (yes/no): ");
            answer = keyboard.next();
        
            if(answer.equalsIgnoreCase("yes"))
                System.out.println("Senior citizen pays 9$");
            else
                System.out.println("Non senior citizen pays 10$");
        }
    }
}
