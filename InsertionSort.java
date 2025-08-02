import java.util.Scanner;
public class InsertionSort {
    private static int[] inputarray(int [] array, int count ,int n,Scanner sc){
        if(count==n){
            return  array;
        }
        array[count]=sc.nextInt();
        return inputarray(array, count+1, n, sc);
    }private static void printarray(int [] array, int count ,int n){
         if(count==n){
            return;
        }
        System.out.print(array[count]+" ");
        printarray( array,  count+1 , n);
    }private static void insertion_sort (int [] array, int n){
        if(n <=1){
            return ;
        }
       insertion_sort (array, n-1);
       insert(array,n-1);
    }private static void insert(int[] array, int index){
        if(index<=0 || array[index]>=array[index-1]){
            return;
        }int temp= array[index];
        array[index]= array[index-1];
        array[index-1]=temp;
        insert(array,index-1);
    }private static int[] InsertionSort(int [] array){
        for(int i=1;i<array.length;i++){
             int key = array[i];
             int j=i-1;
            while(j >= 0 && array[j] > key){
                  array[j + 1] = array[j];
                  j--;
            }array[j+1]=key;
            }return array;
        }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n= sc.nextInt();
        int[]array=new int[n];
        
        inputarray( array, 0 , n,sc);
        printarray( array, 0 , n);
        int [] arrayclone=array.clone();
        System.out.println();
         insertion_sort ( array,  n);
         printarray( array, 0 , n);
         System.out.println();
         printarray( InsertionSort( arrayclone), 0 , n);
    }   
}
