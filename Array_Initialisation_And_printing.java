import java.util.Scanner;

public class Array_Initialisation_And_printing {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Size of Array:-");
        int n= sc.nextInt();
        int [] array= new int[n];
        System.out.println("Input elements in array:-");
        for(int i=0;i<n;i++){
             array[i]= sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
             System.out.print(array[i]+" ");
        }
    }
}
