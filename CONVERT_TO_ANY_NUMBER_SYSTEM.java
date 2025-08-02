import  java.util.*;

public class CONVERT_TO_ANY_NUMBER_SYSTEM {
    static double sum;
    static  Long [] array;
    private static Long power(Long g,int h){
        long pow=1;
        for (int i = 1; i <=h; i++) {
            pow=pow*g;
            
        }return pow;
      
    }
    private  static  void SMALL_TO_DECIMAL(Long n,long  x,long k){
         int j=0;
         sum=0;
        while(n!=0){
            Long rem= n % 10;
            sum+=(rem*power(x, j));
           
            n=n/10;
             j++;}
           System.out.println(sum);
        

    }private static void SMALL_TO_BIG(Long n,Long x,Long k){

    }
    private  static void BIG_TO_SMALL(Long n,Long  x,Long k){
        int i=0;
      
        array= new Long[20000000];
        while(n !=0){
            
          Long remainder= (n%k);
          
          array[i]=remainder;
          n=n/k;
          i++;
          
        }
        for (int j = (i-1); j >=0; j--) {
            System.out.print(array[j]);
            
        }


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the initial base :-");
        Long a= sc.nextLong();
         System.out.print("Enter the final base :-");
        Long  b= sc.nextLong();
        System.out.print("Enter the number :-");
        Long m= sc.nextLong();
        if(a<b){
        SMALL_TO_DECIMAL(m,a,b);}
        else if(a>b){
        BIG_TO_SMALL(m, b, a);}
    }
}
