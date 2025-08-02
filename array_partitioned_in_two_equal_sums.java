import java.util.Scanner;

public class array_partitioned_in_two_equal_sums {
private static int[] input_array(){
          Scanner sc= new Scanner(System.in);
          System.out.print("Enter size of array:-");
          int n= sc.nextInt();
          System.out.println("Enter elements of array:-");
          int [] array= new int[n];
         for (int i = 0; i < array.length; i++) {
             array[i]=sc.nextInt();
         }return  array;
    }private  static void printarray(int [] array){
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        } System.out.println("");
    }private  static int totalsum(int [] array){
        int total=0;
        for (int i = 0; i < array.length; i++) {
            total+=array[i];
        }return  total;
    }
    private  static boolean equalsumpartition(int [] array){
        int total= totalsum(array);
        int prefixsum=0;
        for (int i = 0; i < array.length; i++) {
            prefixsum+=array[i];
            int suffix_sum=total-prefixsum;
            if(prefixsum==suffix_sum){
                return  true;
            }
        }return  false;
    }
    public static void main(String[] args) {
        int [] arr_1=input_array();
        Scanner sc= new Scanner (System.in);
        System.out.println("Original array:-");
        printarray(arr_1);
        if(equalsumpartition(arr_1)==true){
            System.out.println("POSSIBLE");
        }else if (equalsumpartition(arr_1)==false){
            System.out.println(" NOT POSSIBLE");
        }
        
         
        
        
        
       
    }

}
