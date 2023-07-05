import java.util.Scanner;

public class PowerOfTwo {
    static boolean power(int n)
    {
        //My approach
        /*
        if(n<1)
        {
            return false;
        }
        while (n%2==0)
        {
            n = n/2;
        }
        return n==1;

         */
        //Naive
        /*
        if(n==0)
        {
            return false;
        }
        while (n!=1)
        {
            if (n%2!=0)
            {
                return false;
            }
            n = n/2;
        }
        return true;

         */

        //Efficient
        /*
        if (n == 0)
        {
            return false;
        }
        return ((n & (n-1))==0);

         */
        return (n!=0)&&((n&(n-1))==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power(n));
    }
}
