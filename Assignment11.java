import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        // Variable
        double[] myGrades = {0.0,0.0,0.0,0.0,0.0};
        
        myGrades = getGrades(myGrades);

        showGrades(myGrades);

        System.out.println("Your grade avarege is: " + getGradeAvg(myGrades));
    }

    public static double[] getGrades(double[] myGrades){
        try (Scanner keyboard = new Scanner(System.in)) {
            boolean valid = true;

            for(int i=0; i<5; i++){
                valid = false;
                while(valid ==false){
                    System.out.println("Insert "+ (i+1) + " grade: ");
                    myGrades[i] = keyboard.nextDouble();
                    if(myGrades[i] >= 1 && myGrades[i]<= 100){
                        valid = true;
                    }else{
                        System.out.println("Insert a valid number (1-100)");
                    }
                }
            }
        }

        return myGrades;
    }

    public static double getGradeAvg(double[] myGrades){
        double avarage, total = 0;

        for(int i=0; i < myGrades.length; i++){
            total += myGrades[i];
        }

        avarage = total / myGrades.length;

        return avarage;
    }

    public static void showGrades(double[] myGrades){
        for(int i=0; i < myGrades.length; i++){
            System.out.println("Grade number " + (i + 1) + ": " + myGrades[i]);
        }
    }
}