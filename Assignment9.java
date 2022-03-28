/*
There is a course with a certain number of students. In this course the only evaluation 
are certain number of quizzes, graded from 1 to 100. Make a program that:

1) Ask user for the number of students and the number of quizzes in the course

2) Use nested loops to ask for each student quizzes' grades,

3) Calculates the quiz average numerical grade of the course.

4) Print the result on the screen. 
*/
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            // Variables
            int students, numberOfTest, grade, totalGrades = 0;
            double avarageGrades;

            // Ask for number of student and number of test
            System.out.println("How many students: ");
            students = keyboard.nextInt();

            System.out.println("How many test: ");
            numberOfTest = keyboard.nextInt();

            // Ask for each vote
            for(int i = 1; i <= students; i++){
                for(int j = 1; j<= numberOfTest; j++){
                    System.out.println("What is the vote for " + i + " student and " + j + " quiz? ");
                    grade = keyboard.nextInt();

                    // Total
                    totalGrades = totalGrades + grade;
                }
                // Calculate avarege
                avarageGrades = totalGrades / numberOfTest;

                // Print avarage grade
                System.out.println("The avarage of " + i + " student is: " + avarageGrades);

                // Reset total
                totalGrades = 0;

            }
        }

    }
}
