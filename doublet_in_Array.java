import java.util.Scanner;

 public class doublet_in_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many elements in array you want :-");
        int n= sc.nextInt();
        System.out.print("enter the sum of the two numbers you want x:-");
        double x= sc.nextDouble();
        double [] array= new double[n];
         System.out.println("Input elements in array :-");
         for(int i=0;i<n;i++){
            array [i]=sc.nextDouble();
        }
       
         for(int i=0; i<n ;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]+array[j]==x){
                    System.out.println(array[i]+" "+"+"+" "+array [j]+" "+"at indexes"+"("+" "+i+" "+j+" "+")");
    }
}
}
    }}
