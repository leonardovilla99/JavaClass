import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner(System.in)) {
            final int BASE_DISTANCE = 500;

            double weight,distance,cost,costPerBaseDistance;

            System.out.println("Enter the weight of the package(pounds): ");
            weight = keyboard.nextDouble();

            System.out.println("Enter the distance of the package(miles): ");
            distance = keyboard.nextDouble();

            if(weight <= 2.0)
                costPerBaseDistance = 1.1;
            else if(weight <= 6.0)
                costPerBaseDistance = 2.2;
            else if(weight <= 10)
                costPerBaseDistance = 3.7;
            else
                costPerBaseDistance = 3.8;
            
            cost = (distance / BASE_DISTANCE) * costPerBaseDistance;
        
            System.out.println("For this shipment you have to pay $" +cost);
        }
    }
}
