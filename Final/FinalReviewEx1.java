/*
 * Make a program that ask the user for 5 quiz scores(1-100) and show me the number of A's, obtained from those scores. Please use at least one method besides main
 */
import java.util.Scanner;
public class FinalReviewEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_QUIZZES=5;
		double[] quizzes=new double[NUM_QUIZZES];
		
		// Ask user to enter the scores for all the quizzes
		getScores(quizzes);
		// Obtain and print the number of A's from those quizzes
		int numOfA=getANum(quizzes);
		System.out.println("Number of A's: "+numOfA);
	}
	/*
	 * This method allows the user to enter information about the quizzes
	 * parameters: myArray is the array of scores that has to be filled with values from the user
	 * return: nothing
	 */
	public static void getScores(double[] myArray) {
		Scanner keyboard=new Scanner(System.in);
		double quizScore;// auxiliary variable to get the value from the user
		for(int index=0;index<myArray.length;index++) {
			System.out.print("Enter the value for quiz"+(index+1)+": ");
			quizScore=keyboard.nextDouble();
			while(quizScore<1 || quizScore>100) {
				System.out.println("Scores has to be between 1 and 100");
				System.out.print("Enter the value for quiz"+(index+1)+": ");
				quizScore=keyboard.nextDouble();
			}
			myArray[index]=quizScore;
		}		
	}
	/*
	 * this methods uses the array of scores and obtain the number of scores>=90
	 */
	public static int getANum(double[] myArray) {
		int count=0;
		for(int index=0;index<myArray.length;index++) {
			if(myArray[index]>=90)
				count+=1;
		}
		return count;
	}
}
