import java.util.Scanner;
public class GradeToLetter {

	public static void main(String[] args) {
		int grade;
		char letter='I';
		try (Scanner keyboard = new Scanner(System.in)) {
			// Ask user for grade
			System.out.print("Enter grade: ");
			grade=keyboard.nextInt();
		}
		
		// Decide about the letter that corresponds to the grade
		// Individual single ifs
		System.out.println("Individual single ifs");
		if(grade>=90 && grade<=100)
			letter='A';
		if(grade>=80 && grade<=89)
			letter='B';
		if(grade>=70 && grade<=79)
			letter='C';
		if(grade>=0 && grade<=69)
			letter='F';
		if(grade<0 || grade>100)
			letter='I';
		
		System.out.println("For grade "+grade+" corresponds "+letter);
		
		// For balance decision tree
		System.out.println("Calculating letter based on balanced decision tree");
		if(grade<0 || grade>100)
			letter='I';
		else {
			if(grade>=80) {
				// Letter should be either a B or an A
				if(grade>=90)
					letter='A';
				else
					letter='B';
			}
			else {
				// Letter should be either an F or a C
				if(grade>=70)
					letter='C';
				else
					letter='F';
			}
		}
		
		System.out.println("For grade "+grade+" corresponds "+letter);

	}

}
