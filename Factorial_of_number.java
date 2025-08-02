import java.util.Scanner;

public class Factorial_of_number {
    private static long  Factorial(long n){
        if(n==1){
            return  1;
        }else if(n==0){
            return 0;
        }
        return (n*Factorial(n-1));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:-");
        long m=sc.nextLong();
        
          System.out.println("the factorial of the number is :-"+" "+Factorial(m));
          
          
    
}
}