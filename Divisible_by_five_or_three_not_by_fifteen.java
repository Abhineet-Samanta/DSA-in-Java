import  java.util.*;
public class Divisible_by_five_or_three_not_by_fifteen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :-");
        int a=sc.nextInt();
        if(a%3==0||a%5==0){
            if(a%3==0 && a%5!=0){
                System.out.println(a+" "+"divisible by 3");
            }else if(a%5==0 && a%3!=0){
                System.out.println(a+" "+"divisible by 5");
            }else {
                System.out.println(a+" "+"divisible by 15");
            }
        }else{
            System.out.println(a+" "+"is not divisible by 3 ,5 ,15");
        }

    }
}
