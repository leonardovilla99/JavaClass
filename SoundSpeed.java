import java.util.Scanner;

public class SoundSpeed {
    public static void main(String[] args) {

        double distance,time,speed;
        String medium;
        
        try (Scanner keyboard = new Scanner(System.in)) {
            // ask for distance
            System.out.println("Enter the distance: ");
            distance = keyboard.nextDouble();

            // ask for medium
            System.out.println("Enter the medium: ");
            medium = keyboard.next();
        }

        // obtain the sound speed on the chosen medium using switch
        switch(medium.toLowerCase()){
            case "air":
                speed = 1100.0;
                break;
            case "water":
                speed = 4900.0;
                break;
            case "steel":
                speed = 16400.0;
                break;
            default:
                System.out.println("This medium id not in our database"); 
                speed = 0.0;
        }

        // calculate the time required for the sound to travel the distance
        // time = distance / speed
        time = distance / speed;

        // print time .3f%n
        if(speed != 0){
            System.out.printf("The time for the soundwave to travel is going to be %.3sf seconds \n", time);
        }
    }
}
