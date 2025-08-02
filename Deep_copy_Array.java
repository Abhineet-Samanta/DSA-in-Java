import  java.util.Arrays;
public class Deep_copy_Array {
    private  static  void printarray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }System.out.println();
    }public static void main(String[] args) {
            int array[] ={1,2,3,4,5};
            printarray(array);
         

            int[] arr_2 = Arrays.copyOf(array, array.length);
            int []arr_3=Arrays.copyOfRange(array, 0, array.length);
            arr_2[1]=0;
            arr_2[2]=0;
            arr_3[1]=8;
            arr_3[2]=8;
            printarray(arr_2);
            printarray(arr_3);
            
            


    }
    
}
