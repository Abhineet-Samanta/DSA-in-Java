import java.util.Scanner;
public class Distribute_chocolates {
    private  static int inputboxes(){ 
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of chocolate boxes:-");
        int n= sc.nextInt();
        return  n;
    }private static int Students(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of Students to Distribute to:-");
        int m= sc.nextInt();
        return  m;
    }private static int [] inputchocolatesineachbox(){
        Scanner sc= new Scanner(System.in);
        int n=inputboxes();
        int [] array= new int[n];
        System.out.println("Enter number of chocolates in each box:-");
        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }return  array;
    }private  static void printBoxesChocolates(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }System.out.println();
    }private static boolean isDivisionPossible(int maxChocolateAllowed, int m ,int [] a){
        int numberofStudents=1;
        int chocolates=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>maxChocolateAllowed){
                return false;
            }if(a[i]+chocolates<=maxChocolateAllowed){
                chocolates+=a[i];
            }else{
                numberofStudents++;
                chocolates=a[i];
            }
        }return numberofStudents<=m;
    }private static int Distribute_n_chocolates(int [] a, int m){
       if(a.length<m){
         throw new IllegalArgumentException("Students more than boxes");
       }int ans=0,start=1,end=(int)1e9;
       while(start<=end){
        int mid=start+(end-start)/2;
        if(isDivisionPossible(mid,m,a)){
           ans=mid;
           end= mid-1;
        }else{
            start=mid+1;
        }
       }return  ans;

    }
    public static void main(String[] args) {
        int m=Students();
        int [] array=inputchocolatesineachbox();
        printBoxesChocolates(array);
        System.out.print("The minimum of maximum number of chocolates Distributed is:- "+" "+Distribute_n_chocolates(array,m));
    }
    
}
