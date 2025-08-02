
import java.util.Scanner;

public class Binary_Search_in_two_dimention_Array {
    private  static  int[][] inputarraytwoD(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the  number of rows:-");
        int n= sc.nextInt();
         System.out.print("Enter the  number of columns:-");
        int m= sc.nextInt();
        int [] [] array= new int[n][m];
        System.out.println("Input elements of array:-");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j]=sc.nextInt();
                }}
        return  array;
    }private static void print2DArray(int [] [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }System.out.println();
        }
    }private static void print1Darray(int [] arr){
         for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i]+" ");
         }System.out.println();
    }
    private static int [] traverse2Darray(int [][] array){
        int idx=0;
        int [] arr= new int[array.length*array[0].length];
         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                arr[idx++]=array[i][j];
            }  
         }return arr;
    }private static void  QuickSort(int [] array, int x, int y){
        if(x>=y){
            return ;
        }int pivotindex=partition(array,x,y);
        QuickSort(array, x, pivotindex-1);
        QuickSort(array, pivotindex+1, y);
    }private static void swap(int[]array, int i,int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    private static int partition(int [] array, int x, int y){
        int pivot=array[x];
        int count=0;
        for (int i = x+1; i <=y; i++) {
            if(array[i]<=pivot){
                count++;
            }
        }int pivotindex=x+count;
        swap(array, x, pivotindex);
        int i= x; int j=y;
        while (i<pivotindex && j>pivotindex) { 
            while(array[i]<=pivot){i++;}
            while(array[j]>pivot){j--;}
            if(i<pivotindex && j>pivotindex){
                swap(array, i, j);
                i++;
                j--;
            }
        }return pivotindex;

    }private static boolean findelementbyBinarySearch(int[] array, int key, int left, int right){
        while(left<=right){
            int mid= (left+right)/2;
            if(key== array[mid]){
                return  true;
            }
            if(array[mid]>=key){
                right= mid-1;
            }else{
                left=mid+1;
            }
        } return  false;
    }private static  int inputkey(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter element you want to find:-");
        int key= sc.nextInt();
        return  key;
    }private static void findelementdisplay(int [] arr){
        if(findelementbyBinarySearch(arr, inputkey(), 0, arr.length-1)==true){
            System.out.println("Found element");
        }else{
            System.out.println("Not Found element");
        }
    }
    public static void main(String[] args) {
        int [] [] array;int[]arr;
        array=inputarraytwoD();
        arr=traverse2Darray(array);
        print2DArray(array);
        QuickSort(arr, 0, arr.length-1);
        print1Darray(arr);
        System.out.println("");
        findelementdisplay(arr);

        
    }
}
