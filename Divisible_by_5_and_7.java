import java.util.Scanner;
public class Divisible_by_5_and_7 {
   
    public static void main(String [] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter the number till where you want to print factors of 5 and 7:- ");
     int n= sc.nextInt();
     int i=0;
     while(i<=n){
        if(i%5==0 && i%7==0){
            System.out.print(i+" ");
        }i++;
     }



    }
}

