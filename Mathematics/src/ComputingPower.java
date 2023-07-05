public class ComputingPower {
    //Naive Solution
    /*
    static  int power(int x,int n)
    {
        int res = 1;
        for(int i=0;i<n;i++)
        {
            res = res*x;
        }
        return res;
    }

     */

    //Efficient Solution
    static int power(int x,int n)
    {
        if(n == 0)
            return 1;

        int temp = power(x, n/2);

        temp = temp * temp;

        if(n % 2 == 0)
            return temp;
        else
            return temp * x;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(power(x,n));
    }
}
