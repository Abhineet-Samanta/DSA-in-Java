import  java.util.Scanner;

public class a_raised_to_b {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number:-");
    double a= sc.nextDouble();
     System.out.print("Enter power:-");
      double b= sc.nextDouble();
      System.out.println(Math.pow(a, b));
       
   } 
}
