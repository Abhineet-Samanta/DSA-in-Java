
import java.util.Scanner;

public class Decimal_to_Binary {
    static  Long [] array;
    public  static void DecimalBinaryconversion(Long n){
        int i=0;
      
        array= new Long[20000000];
        while(n !=0){
            
          long remainder= n%2;
          
          array[i]=remainder;
          n=n/2;
          i++;
          
        }
        for (int j = (i-1); j >=0; j--) {
            System.out.print(array[j]);
            
        }



    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :-");
        Long m= sc.nextLong();
        System.out.print("The binary equivalent is :-"+" ");
        DecimalBinaryconversion(m);
    }
}
