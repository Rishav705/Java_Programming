import java.math.BigInteger;
import java.util.Scanner;

public class PrimeAndNextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(nextPrime(n));
    }

    //isPrime
    public static boolean isPrime(int n)
    {
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(1);
    }

    //nextPrime
    public static int nextPrime(int n)
    {
        BigInteger b = BigInteger.valueOf(n);
        String a = b.nextProbablePrime().toString();
        return Integer.parseInt(a);
    }
}
