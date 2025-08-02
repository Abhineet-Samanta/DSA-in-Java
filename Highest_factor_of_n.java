import java.util.Scanner;
 
public class Highest_factor_of_n {
     static long m;
    private static int Factor_highest (long n){
        
        long i;
        
       
         
        for(i=n-1;i<=n;i--){
             if(n%i==0){
                m=i;
              break;
             }
        }return (int) m;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("For which number you want to print highest factor:-");
        long j= sc.nextLong();
        System.out.print("The highest factor is :-"+" "+Factor_highest(j));
        
        
    }
}
