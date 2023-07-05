public class BrianKerningamAlgorithm {
    static int countSet(int n)
    {
        int res = 0;
        while (n>0)
        {
            n = (n&(n-1));
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countSet(n));
    }
}
