public class EuclideanAlgorithm {
    static int gcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a = a-b;
            }
            else
            {
                b = b-a;
            }
        }
        return  a;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(gcd(a,b));
    }
}
