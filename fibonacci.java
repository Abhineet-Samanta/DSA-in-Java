import java.util.Scanner;

public class fibonacci {
    private static long fibonacci(long n){
        if(n==0){
            return  0;
        }else if (n==1){
            return  1;
        }return (fibonacci(n-1)+fibonacci(n-2));
        }private static void   displayfibonacciseries(long n,long curr){
            if(curr<n){
                System.out.print(fibonacci(curr)+" ");
                displayfibonacciseries(n, curr+1);
            }
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Till where you want to print fibonacci series  :-");
        long n= sc.nextLong();
       System.out.println("fibonacci Series is :-");
        displayfibonacciseries(n, 0);
    }
}
