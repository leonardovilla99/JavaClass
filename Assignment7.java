import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args){

        // Variable
        final double TAX = 0.06;
        boolean moreItem = true;
        double total = 0, finalTotal,tax;
        String answer;

        try (Scanner keyboard = new Scanner(System.in)) {
            // Adding item with loop
            System.out.println("Item cost?");
            total = total + keyboard.nextDouble();
            
            while(moreItem == true){
                System.out.println("Are there more items to include(yes/no)?");
                answer = keyboard.nextLine();
                if(answer == "yes"){
                    System.out.println("Item cost?");
                    total = total + keyboard.nextDouble();
                }else{
                    moreItem = false;
                }
            }
        }

        // Calculate
        tax = total * TAX;
        finalTotal = total + tax;

        // Display to the user
        System.out.println("Payment print:");
        System.out.printf("Subtotal: $%.2f\n", total);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", finalTotal);

    }
}
