import java.util.Scanner;


public class Maximum_out_of_all_in_Array {
      static double max;
        static double min;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many elements in array you want :-");
        int n= sc.nextInt();
        double [] array= new double[n];
         System.out.println("Input elements in array :-");
         for(int i=0;i<n;i++){
            array [i]=sc.nextDouble();
        }
       

           max=array[0];  
           min= array[0];
        for(int i=0;i<n;i++){
            
            if(array[i]>=max){
                 max= array[i];
            }
        }for(int i=0;i<n;i++){
             
            if(array[i]<=min){
                 min=array[i];
            }
        }
        System.out.println("The mininum of array is :-"+" "+max);
        System.out.println("The mininum of array is :-"+" "+min);
    }
}
