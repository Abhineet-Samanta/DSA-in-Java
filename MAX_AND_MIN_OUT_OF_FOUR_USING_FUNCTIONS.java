import java.util.Scanner;
import java.util.Math;

public class MAX_AND_MIN_OUT_OF_FOUR_USING_FUNCTIONS {
    private static double  max(double x,double y,double z,double w){
        double p=Math.max(Math.max(Math.max(x, y),z),w);
       
        return p;
    }private static double  min(double x,double y,double z,double w){
        double p=Math.min(Math.min(Math.min(x, y),z),w);
       
        return p;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:-");
        double a=sc.nextDouble();
         System.out.print("Enter the second  number:-");
        double b=sc.nextDouble();
         System.out.print("Enter the third  number:-");
        double c=sc.nextDouble();
         System.out.print("Enter the fourth  number:-");
        double d=sc.nextDouble();
       System.out.println("The maximum out of four is:-"+" "+max(a, b, c,d));
        System.out.println("The minimum out of four is:-"+" "+min(a, b, c,d));

    }
}
