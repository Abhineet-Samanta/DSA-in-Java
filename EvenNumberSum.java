import java.util.Scanner;
public class EvenNumberSum {
    private  static int  sumeven(int n, int count){
        
        if(count == n+1){
            return 0;
        }
        if(count%2==0){
            return count + sumeven(n, count + 1);
        }else{
      return sumeven(n, count+1);}
    }private static int  input(){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter till where you want even number sum:-");
         int n= sc.nextInt();
         return  n;
    }public static void main(String[] args) {
        int n=input();
        System.out.println("The sum of even numbers is :-"+" "+sumeven(n, 0));
    }
    
}
