import java.util.Scanner;

public class Inverted_Star_Triangle_with_characters {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner (System.in);
    System.out.println("Till where you want to print inverted triangle:-");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }System.out.println();
        }
        }
}
