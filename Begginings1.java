import  java.util.*;
public class Begginings1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(a>=b && a>=c){
            System.out.println("the greatest number is "+" "+a);
        }else if (b>a && b>=c){
            System.out.println("the greatest number is "+" "+b);
        }else if (c>a && c>a){
            System.out.println("the greatest number is"+" "+c);
        }
        
    }
}