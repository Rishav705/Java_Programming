public class CountSetBit {
    //Naive
    //for the better and efficient we can us Brian Kerningam's Algorithm or Lookup Table Method for 32 bit number
    static int countSet(int n)
    {
        int res = 0;
        while(n > 0)
        {
            if (n%2!=0)  //if(n&1==1)    //res = res+(n&1)
            {
                res++;
            }
            n = n/2;     //n=n>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countSet(n));
    }
}
