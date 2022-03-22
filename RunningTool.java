public class RunningTool {
    public static void main(String[] args) {
        
        int sum = 0;
        // Count from 1 to 10 in step of 1
        for(int count = 1; count>= 1 && count <= 10; count ++){ // For loop header
            // For loop body
            System.out.println(count);
            sum = sum + count;
        }
        System.out.println("Sum from 1 to 10 is " + sum);
    }
}
