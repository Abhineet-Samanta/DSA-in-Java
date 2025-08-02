import java.util.Scanner;
import java.util.Math;

public class MAX_OUT_OF_THREE_USING_FUNCTIONS {
    private static long max(long x,long y,long z){
        long p=Math.max(Math.max(x, y),z);
       
        return p;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:-");
        long a=sc.nextLong();
         System.out.print("Enter the second  number:-");
        long b=sc.nextLong();
         System.out.print("Enter the third  number:-");
        long c=sc.nextLong();
       System.out.println("The maximum out of three is:-"+" "+max(a, b, c));

    }
}
