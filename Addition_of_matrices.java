
import java.util.Scanner;

public class Addition_of_matrices {
   
    private static double [] [] inputarray(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows:-");
        int n= sc.nextInt();
        System.out.print("Enter the number of column:-");
        int m= sc.nextInt();
        double [][] array=new double[n][m];
        System.out.println("Enter array elements ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j]=sc.nextDouble();
            }
            
        }return array;
    }private static void printarray(double [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }System.out.println();
            
        }
    }public static double[][] sum(double[][] array1,double [][]array2) {
        if(array1.length!=array2.length && array1[0].length!=array2[0].length){
            throw new IllegalArgumentException("Not able to add matrices try again");
        }
        
        double[][]sum=new double[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                sum[i][j]=array1[i][j]+array2[i][j];
            }
        }
      return  sum;
    }
    public static void main(String[] args) {
        double [][] arr_1=inputarray();
        printarray(arr_1);
        double [][] arr_2=inputarray();
        printarray(arr_2);
        System.out.println("sum of these matrices is:-");
        printarray(sum(arr_1, arr_2));
        
    }
}
