import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args){

        // Variable
        int n = 0,m = 0;
        Boolean validNumber = false;

        try (Scanner keyboard = new Scanner(System.in)) {
            // Ask for N and M
            while(validNumber == false){
                System.out.print("Enter N: ");
                n = keyboard.nextInt();

                System.out.print("Enter M: ");
                m = keyboard.nextInt();

                if(m > n){
                    validNumber = true;
                }else{
                    System.out.println("N cannot be higher than M, try again");
                }
            }
        }

        while(n <= m){
            System.out.println(n);
            n ++;
        }


        

    }
}
