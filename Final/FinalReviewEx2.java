/*
 * Create a program that ask the user to enter the information of first name and height of 5 students, store names and  heights inside an array each. Then report the student's name with the highest height. Use at least one method besides main
 */
import java.util.Scanner;
public class FinalReviewEx2 {

	public static void main(String[] args) {
		final int NUM_STUDENTS=5;
		String[] names=new String[NUM_STUDENTS];
		double[] heights=new double[NUM_STUDENTS];
		
		// Ask user to enter the information about first name and height of each student
		getStudentInfo(names,heights);
		// Calculate the maximun height among the students
		double maxHeight=getMaxHeight(heights);
		// Print Students' names for those students with maximum height
		showTallest(heights,maxHeight,names);
	}
	
	/*
	 * This method is going to ask user for the name and the height of each student
	 */
	public static void getStudentInfo(String[] names,double[] heights) {
		Scanner keyboard=new Scanner(System.in);
		String name;
		double height;
		for(int index=0;index<names.length;index++) {
			System.out.print("Enter student"+(index+1)+" first name: ");
			name=keyboard.next();
			System.out.print("Enter student"+(index+1)+" height: ");
			height=keyboard.nextDouble();
			while(height<0) {
				System.out.println("Height cannot be negative");
				System.out.print("Enter student"+(index+1)+" height: ");
				height=keyboard.nextDouble();
			}
			names[index]=name;
			heights[index]=height;
			
		}
	}
	/*
	 * this method is going to take the heights and return the highest height
	 */
	public static double getMaxHeight(double[] heights) {
		double maxHeight=heights[0];
		for(int index=0;index<heights.length;index++) {
			if(heights[index]>maxHeight)
				maxHeight=heights[index];
		}
		return maxHeight;
	}
	/*
	 * this method is going to print the names of the students with height is equal to the maximum height
	 */
	public static void showTallest(double[] heights,double maxHeight,String[] names) {
		
		System.out.println("Tallest student(s): ");
		for(int index=0;index<heights.length;index++) {
			if(heights[index]==maxHeight)
				System.out.println("Name: "+names[index]);
		}
	}
	

}
