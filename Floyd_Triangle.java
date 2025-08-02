import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    System.out.print("till where you want to print floyd triangle:-");
     int n= sc.nextInt();
      int p=1;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(p+" ");
            p++;
        }System.out.println();
      }
      }
}
