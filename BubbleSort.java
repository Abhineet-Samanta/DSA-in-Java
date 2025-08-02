import java.util.Scanner;
public class BubbleSort {
    private static int[] inputarray(int [] array,int idx,int n,Scanner sc){
        if(idx== n){
            return array;
        }
        array[idx]=sc.nextInt();
       return  inputarray(array, idx+1, n,sc);
       
    }private static void printarray(int [] array,int idx,int n){
        if(idx==(n)){
            return;
        } System.out.print(array[idx]+" ");
        printarray(array, idx+1, n);
    }private static int[] BubbleSortWithLoops(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                     int temp= array[j];
                     array[j]= array[j+1];
                     array[j+1]=temp;
                }
            }
            
        }return array;
    }
    private static int [] BubbleSort(int [] array,int idx,int n,int count){
        if(idx==n-1 ){
            return array;
        }if(count==n-idx-1){
             return BubbleSort(array, idx+1, n, 0);
        }
        if(array[count]>=array[count+1]){
           int temp= array[count];
           array[count]= array[count+1];
           array[count+1]=temp;
        }
       return BubbleSort(array, idx, n, count+1);
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array:-");
        int n = sc.nextInt();
        System.out.println("Input array:-");
        int [] array=new int[n];

        array=inputarray(array, 0, n,sc);
        int [] array2=array.clone();
        printarray(array, 0, n);
        System.out.println("");
        printarray(BubbleSort(array, 0,n, 0), 0, n);
        System.out.println("");
        printarray(BubbleSortWithLoops(array2), 0, n);
    }
}
