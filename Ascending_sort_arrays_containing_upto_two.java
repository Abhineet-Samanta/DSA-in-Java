import java.util.Scanner;

public class Ascending_sort_arrays_containing_upto_two {
    private static int[] inputarray(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array:-");
        int n= sc.nextInt();
        int[]array= new int[n];
         System.out.println("Enter elements of array:-");
        for (int i = 0; i < array.length; i++) {
            int value= sc.nextInt();
            if(value>=0 && value <=2){
            array[i]= value ;}
            else{
               throw  new  IllegalArgumentException("Entered greater than 2");
            }
        }return  array;
    }private static void  printarray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }System.out.println();
    }private static void countSort(int [] array){
        int [] count=new int[3];
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[j]==i){
                    count[i]++;
                }
            }   
        }  int i=0;
        for (int j = 0; j < count.length; j++) {
            while(i<array.length && count[j]!=0){
                array[i]=j;
                count[j]--;
                i++;
            }
            
        }
    }
    public static void main(String[] args) {
        int[] array=inputarray();
        printarray(array);
        countSort(array);
        printarray(array);
    }
}
