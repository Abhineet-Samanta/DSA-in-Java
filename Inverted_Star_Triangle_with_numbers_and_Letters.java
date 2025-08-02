import java.util.Scanner;

public class Inverted_Star_Triangle_with_numbers_and_Letters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                System.out.print((char)(i+64));}
            else{
                System.out.print(i);
            }
        }System.out.println();
    }
    }
}
