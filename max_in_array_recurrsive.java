import java.util.Scanner;

public class max_in_array_recurrsive {
    private static void inputarray(int[]array,int n,int count){
        Scanner sc= new Scanner(System.in);
         
        if(count==n){
           return ;
        }array[count]=sc.nextInt();
        inputarray(array,n, count+1);}
    private static void print_all_array_values(int[] array,int count,int n){
        if(count==n){
            return ;
        }
        
        System.out.print(array[count]+" ");
        print_all_array_values(array, count+1, n);

    }
    private static int max(int [] array,int n,int count){
       
        if(count==(n-1)){
            return array[count];
        } int max= max(array, n, count+1);
        
        return  Math.max(array[count],max);
    }public static void main(String[] args) {
         System.out.print("Enter size of array:-");
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         int[] arr=new int[n];
         inputarray(arr,n, 0);
         print_all_array_values(arr, 0, n);
         System.out.println();
         System.out.println(max(arr, n, 0));
    }

}
