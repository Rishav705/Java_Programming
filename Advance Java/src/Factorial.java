import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger factorial(int a)
    {
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=a;i++)
        {
            BigInteger x = BigInteger.valueOf(i);
            f = f.multiply(x);
        }
        return f;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));
    }
}
