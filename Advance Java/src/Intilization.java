import java.math.BigInteger;

public class Intilization {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("54");
//        BigInteger B = new BigInteger("100");

//        BigInteger C = A.add(B);
//          BigInteger C = A.multiply(B);

//        System.out.println(A.compareTo(B));
//        System.out.println(A.remainder(B));
        int a = A.intValue();
        long b = A.longValue();
        String z = A.toString();
        System.out.println(a+" "+b+" "+z);
    }
}
