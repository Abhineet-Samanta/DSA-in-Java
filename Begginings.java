import java.util.*;
public class Begginings {
    public static void butterflies(int n){
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }
            
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
        for (int i = n; i>=1; i--) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }
            
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }public  static void parrallelogram(int n){
        for (int i = 1; i <= n; i++) {
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print('*');
            }
            System.out.print("\n");
            
        }
    }public  static void hollowparrallelogram(int n){
        for (int i = 1; i <= n; i++) {
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||j==n||i==n||j==1){
                System.out.print("*");}
                else{
                System.out.print(" ");
            }
            }
            System.out.print("\n");
            
        }
    }public static void Heart(int n){
        for(int i=0;i<=(n-1);i++){
            for(int j=0;j<=n;j++){
                if(i-j==2||i+j==8||i==0&&j%3!=0||i==1&&j%3==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("\n");
        }
    }public static void numberPyramid(int n) {
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                   System.out.print(i+" ");
            }System.out.print("\n");

            
        }
        
    }public static void palindrome_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k= 1; k < n-i; k++) {
                System.out.print(" ");
            }for (int j= i; j >= 1; j--) {
                System.out.print(j);
            }for (int j= 2; j <= i; j++) {
                System.out.print(j);
            }System.out.print("\n");
        }
        
    }public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }System.out.print("\n");
            
        }for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }System.out.print("\n");
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        butterflies(m);
        parrallelogram(m);
        hollowparrallelogram(m);
        Heart(6);
        numberPyramid(m);
        palindrome_Pyramid(m);
        diamond(m);
    }
}