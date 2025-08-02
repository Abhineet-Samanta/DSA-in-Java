import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Till where you want to print GP:-");
        int n= sc.nextInt();
        double b;
        for (int i = 0; i <= n; i++) {
             b=Math.pow(2,i);
             System.out.print(b+" ");
        }

    }
}
