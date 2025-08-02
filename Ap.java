
import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Till where you want to print :-");
        int n= sc.nextInt();
        int a;
        for (int i = 1; i <= n; i++) {

            a=(2*i)-1;
            System.out.println(a);
        }


    }
}
