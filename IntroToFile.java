import java.io.*;
import java.util.Scanner;

public class IntroToFile {
    public static void main(String[] args) throws Exception{
        // Create a file
        PrintWriter outfile1 = new PrintWriter("example1.txt");
        outfile1.println("Hello World");
        outfile1.close();

        // For appending we need a 2 step process
        // first connect with the file
        FileWriter fw = new FileWriter("example1.txt", true);
        // second pass fw as argument to the creation of the PrintWriter object
        PrintWriter outfile2 = new PrintWriter(fw);
        outfile2.println("we are people");
        outfile2.close();
        fw.close();

        // For reading
        // first we connect File 
        File file1 = new File("example1.txt");
        // second we connect scanner object to file
        if(file1.exists()){
            Scanner infile = new Scanner(file1);
            String line1;
            while(infile.hasNext()){
                line1 = infile.nextLine();
                System.out.println(line1);
            }
            infile.close();
        }else
            System.out.println("File do not exist");
    }
}
