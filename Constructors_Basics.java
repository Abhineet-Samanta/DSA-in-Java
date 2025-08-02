
import java.util.Scanner;

class Algebra{
    int a;
    int b;
    
    Algebra(int x, int y){//parameterised constructor
        a=x;
        b=y;
        System.out.println("Algebra called");
    }
    int sum(){
        int ans=a+b;
        return ans;
    }int difference(){
       int ans= a-b;
        return  ans;
    }
}
public class Constructors_Basics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        Algebra object= new Algebra(a,b);
        int add=object.sum();
        int sub= object.difference();
        Algebra object1= new Algebra(8,8);
        int add1=object1.sum();
        int sub1= object1.difference();
        System.out.println(add +" "+sub);
         System.out.println(add1 +" "+sub1);

    }
    
}
