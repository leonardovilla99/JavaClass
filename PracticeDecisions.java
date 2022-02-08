import java.util.Scanner;

public class PracticeDecisions {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean coldOutside = false;
        // double temperature = 55;
        String answer;

        System.out.println("Is it cold outside(yes/no)? ");
        answer = keyboard.next();
        
        // Using cold outside as a flag for temperature below 65
        if(answer.equalsIgnoreCase("yes"))
            coldOutside = true;

        if(coldOutside)
            System.out.println("Wear a coat");
             

    }
}
