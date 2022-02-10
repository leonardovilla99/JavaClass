import java.util.Scanner;

public class MagicDates {
    public static void main(String[] args) {
        
        // Initialize variable
        int day,month,year;

        Scanner keyboard = new Scanner(System.in);

        // Ask for month
        System.out.println("Enter month in a digit format: ");
        month = keyboard.nextInt();

        // Ask for day
        System.out.println("Enter day: ");
        day = keyboard.nextInt();

        // Ask for year
        System.out.println("Enter year(2 digit format): ");
        year = keyboard.nextInt();

        // Show if the date is magic or not
        if(month * day == year)
            System.out.println("Date is magic");
        else
            System.out.println("Date is not magic");
    }
}
