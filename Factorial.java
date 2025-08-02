
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    private  static BigInteger Factorial(BigInteger n){
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }return n.multiply(Factorial(n.subtract(BigInteger.ONE))) ;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BigInteger n= sc.nextBigInteger();
        System.out.println("Factorial is :-"+" "+Factorial(n));
        
    }
}
