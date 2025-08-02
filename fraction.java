public class fraction {
    public static  int gcd(int num, int den){
        int min=Math.min(num, den);
        for (int i = min; i>=1; i--) {
            if(num %i==0&& den%i==0){return i;}
        }return 1;
    }public static  fractional add(fractional f1, fractional f2){
        int numerator=(f1.num*f2.den) + (f1.den*f2.num);
        int denominator=f1.den*f2.den;
        fractional f3= new fractional(numerator, denominator);
        return  f3;
    }public  static fractional subtract(fractional f1, fractional f2){
         int numerator=(f1.num*f2.den) - (f1.den*f2.num);
        int denominator=f1.den*f2.den;
        fractional f4= new fractional(numerator, denominator);
        return  f4;
    }private  static fractional multiply(fractional f1, fractional f2){
       int numerator=(f1.num*f2.num) ;
        int denominator=f1.den*f2.den;
        fractional f5= new fractional(numerator, denominator);
        return  f5;
    }
    private  static class fractional{
        int num;
        int den;

        public fractional(int num, int den) {
              this.num= num;
              this.den= den;
              simplify();
        }public void  simplify(){
           int hcf=gcd(num, den);
           num/=hcf;
           den/=hcf;
        }
        
    }public static void main(String[] args) {
        fractional s1= new fractional(2, 3);
        System.out.println(s1.num+"/"+s1.den);
        
        fractional s2= new fractional(8, 8);
        System.out.println(s2.num+"/"+s2.den);
        fractional f3= add(s1, s2);
        System.out.println("Addition of both fractions are="+" "+f3.num+"/"+f3.den);
         fractional f4= subtract(s1, s2);
        System.out.println("Subtraction of both fractions are="+" "+f4.num+"/"+f4.den);
        fractional f5= multiply(s1, s2);
        System.out.println("Multiplication of both fractions are="+" "+f5.num+"/"+f5.den);
    }
}
