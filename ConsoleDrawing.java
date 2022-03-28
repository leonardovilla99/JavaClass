import java.util.Scanner;

public class ConsoleDrawing {
    public static void main(String[] args) {
        // Vatiable
        int numOfCols = 0, numOfRow = 0;

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Insert number of colloms: ");
            numOfCols = keyboard.nextInt();

            System.out.println("Insert number of rows: ");
            numOfRow = keyboard.nextInt();
        }

        for(int rows = 1; rows <= numOfRow; rows ++){
            for(int colloms = 1; colloms <= numOfCols ; colloms++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
