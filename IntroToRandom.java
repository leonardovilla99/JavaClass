import java.util.Random;

public class IntroToRandom {
    public static void main(String[] args) throws Exception{

        Random rng = new Random();

        // int minInt = 10, maxInt = 30;
        
        // int[] myIntegers = new int[5];
        // for(int i = 0; i< myIntegers.length;i++){
        //     myIntegers[i] = rng.nextInt(maxInt - minInt + 1) + minInt;
        // }

        // for(int i = 0; i< myIntegers.length; i++){
        //     System.out.print(myIntegers[i] + " ");
        // }

        int[][] matrix=new int[3][3];
        int number = 0;

        for(int k=0; k<matrix.length; k++){
            for(int j=0; j<matrix[k].length; j++){
                do{
                    number = rng.nextInt(10);
                }while(checkIfRepeat(matrix, number));
                matrix[k][j] = number;
            }
        }

        for(int a=0; a<matrix.length; a++){
            for(int b=0; b<matrix[a].length; b++){
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int sum = 0;
        // Add code and return the proper number
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][(matrix.length -1) - i];
        }

        System.out.println(sum);
    }


    public static boolean checkIfRepeat(int[][] array, int number){

        for(int i=0; i<array.length; i++){
            for(int o=0; o<array[i].length; o++){
                if(array[i][o] == number){
                    return true;
                }
            }
        }
        return false;
    }
}