import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        // Create variable
        int matrix[][] = new int[3][3];
        int high = 0;

        //Call method
        matrix = get2DMat(matrix);

        high = max2DMat(matrix);

        //Print High value
        System.out.println("The biggest number in the array is: " + high);
    }

    public static int[][] get2DMat(int[][] myArray){
        try (// Crate variable
        Scanner keyboard = new Scanner(System.in)) {
            // Ask for values
            for(int i = 0; i < myArray.length; i++){
                for(int k = 0; k< myArray[i].length; k++){
                    System.out.println("Insert row " + (i+1) + ", collumn " + (k+1) + " value: ");
                    myArray[i][k] = keyboard.nextInt();
                }
            }
        }

        return myArray;
    }

    public static int max2DMat(int[][] myArray){
        // Create variable
        int high = 0;
        
        // Find biggest value
        for(int i = 0; i < myArray.length; i++){
            for(int k = 0; k< myArray[i].length; k++){
                if(myArray[i][k] > high){
                    high = myArray[i][k];
                }
            }
        }

        return high;
    }
}
