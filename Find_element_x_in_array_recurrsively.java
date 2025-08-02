import java.util.ArrayList;
import  java.util.Scanner;
public class Find_element_x_in_array_recurrsively {
    private static void inputarray(int[]array,int n,int count){
        Scanner sc= new Scanner(System.in);
        if(count==n){
            return;
        }array[count]=sc.nextInt();
        inputarray(array, n, count+1);

    }private static void printarray(int [] array,int n,int count){
        if (count==n) {
            return;
        }System.out.print(array[count]+" ");
        printarray(array, n, count+1);
    }private static boolean  find (int key,int [] array,int n,int count){
        int k=0;
        if (count==n) {
            System.out.println("Key not found in the array.");
            return false;
        }if (key==array[count]) {
            System.out.println("Found");
             
           
        }else{
           find(key, array, n, count+1);}
        return true;
    }private static void findindexes(int key,int [] array,int n,int count,int k,String indices){
        if(count==n){
            if(indices.isEmpty()){
                return;
            }else{
                System.out.println("The element is found at:-"+" "+indices);
            }return;
        }
        if(array[count]==key){
            indices+=count+" ";
        }findindexes(key, array, n, count+1, k, indices);
    }private static ArrayList<Integer> findindexes2(int key,int [] array,int n,int count){
       if(count>=n){
        return  new ArrayList<Integer>();
       }   
    ArrayList<Integer> answer=new ArrayList<>();
if(array[count]==key){
  answer.add(count);
}ArrayList<Integer>smallAnswer=findindexes2(key, array, n, count+1);
answer.addAll(smallAnswer);
return answer;}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Size of array:-");
        int n= sc.nextInt();
        int [] array=new int[n];
        System.out.println("Enter elements of array:-");
        inputarray(array, n, 0);
        printarray(array, n, 0);
        System.out.println();
        System.out.print("Enter element to find :-");
        int key=sc.nextInt();
        find(key, array, n, 0);
        System.out.println();
       findindexes(key, array, n, 0, 0," ");
       System.out.println(findindexes2(key, array, n, 0));

    }
}
