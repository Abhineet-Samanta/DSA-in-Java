
import java.util.Scanner;

public class GratestCommonDivisor {
    private  static int  min(int n, int m){
        if(m>=n){
            return n;
        }else{
            return m;}}
        private static int GCDBruteForce(int n, int m) {
        return findGCD(min(n, m), n, m);
    }private static int findGCD(int current, int n, int m) {
        if (current == 1) {
            return 1; 
        }
        if (n % current == 0 && m % current == 0) {
            return current;
        }
        return findGCD(current - 1, n, m);
    }private  static int LongDivision(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }return y;
    }private static int GCDEuclid_Algorithm(int x,int y){
        if(y==0){
            return  x;
        }return GCDEuclid_Algorithm(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " is: " + GCDBruteForce(a, b));
         System.out.println("GCD of " + a + " and " + b + " is: " + LongDivision(a, b));
           System.out.println("GCD of " + a + " and " + b + " is: " +  GCDEuclid_Algorithm(a, b));
    }
}
