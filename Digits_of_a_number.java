import java.util.Scanner;



public class Digits_of_a_number {
    private static boolean   isPalindrome(long n){
        long sum=0;
        
        long b=n;
        do { 
            sum=(sum*10)+(b%10);
            b=b/10;
            
        } while (b!=0);
        
        if(sum==n){
            return true;
        }return  false;
    }
    private static long  Digits(long n){
         long  count =0;
        while (n!=0){
            n=n/10;
          count++;
        }
        return count ;
    }
    public static void main (String[]args ){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number you want the number of digits:-");
         long m= sc.nextLong();
        System.out.println("The number of digits of number is:-"+" "+Digits(m));
        System.out.println();
        if(isPalindrome(m)==true){
            System.out.println("The number is a palindrome ");
        }else if(isPalindrome(m)==false){
             System.out.println("The number is not a palindrome ");
        }


    }
}
