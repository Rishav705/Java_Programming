public class DivisorNumber {
    //Naive
    /*
    static void printDivisor(int n)
    {
        for (int i = 1;i<=n;i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");
            }
        }
    }

     */
    //Efficient Solution
    /*
    static void printDivisor(int n)
    {
        for (int i = 1;i*i<=n;i++)
        {
            if (n % i == 0)
            {
                System.out.print(i+" ");
                if (i!= n/i)
                {
                    System.out.print(n/i+" ");
                }
            }
        }
    }

     */
    static void printDivisor(int n)
    {
        int i;
        for ( i=1;i*i<n;i++)
        {
            if (n % i==0)
            {
                System.out.print(i+" ");
            }
        }
        for ( ;i>=1;i--)
        {
            if (n % i == 0)
            {
                System.out.print(n/i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 25;
        printDivisor(n);
    }
}
