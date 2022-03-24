import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        // Variable
        int numOfRooms, numOfRoomsOcc, totalRooms = 0,totalRoomsOcc = 0,numOfFloors;
        double occupacyRate;

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter the number of floors: ");
            numOfFloors = keyboard.nextInt();

            for(int floorNum = 1; floorNum <= numOfFloors; floorNum++){

                System.out.println("Enter the number of room in floor " + floorNum + ": ");
                numOfRooms = keyboard.nextInt();

                totalRooms = totalRooms + numOfRooms;

                System.out.println("How many are occupied? ");
                numOfRoomsOcc = keyboard.nextInt();

                totalRoomsOcc = totalRoomsOcc + numOfRoomsOcc;
            }
        }

        System.out.println("# rooms: " + totalRooms);
        System.out.println("# rooms occupied: " + totalRoomsOcc);
        System.out.println("# rooms vacant: " + (totalRooms - totalRoomsOcc));
        
        occupacyRate = (double) totalRoomsOcc/totalRooms;

        System.out.printf("Occupacy Rate: %.2f\n", occupacyRate);

    }
}
