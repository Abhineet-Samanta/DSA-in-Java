import  java.util.Scanner;
public class Last_occurance_of_array {
    private  static int [] inputarray(){
               Scanner sc= new Scanner(System.in);
               System.out.print("Enter the number of elements in array:-");
               int n= sc.nextInt();
               int[] arr= new int [n];
               System.out.println("Enter array elements :-");
               for (int i = 0; i < arr.length; i++) {
                   arr[i]=sc.nextInt();
               }System.out.println();
               return  arr;
        
    }private static void printarray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }System.out.println();
    }private static boolean  Found_true_or_false(int[] array,int key){
         int flag=0;
         for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                flag++;
                break;
            }}
            if(flag > 0){
                return  true;
            }
        return  false;

    }private static int LastOccurance(int [] array, int key){
        int maxIndex= Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                maxIndex=i;
            }
        }return maxIndex;
    }
     public static void main(String[] args) {
        int []array= inputarray();
        printarray(array);
        Scanner sc= new Scanner(System.in);
        System.out.print("Which element to be found :-");
        int key= sc.nextInt();
        if (Found_true_or_false(array, key)==false) {
            System.out.println("Not Found ");
        }else if (Found_true_or_false(array, key)==true){
            System.out.println("Last occurance is "+" "+"index "+" "+LastOccurance(array, key)+" "+"of array");
           
        }
        

        
        
        
        
    }
}
