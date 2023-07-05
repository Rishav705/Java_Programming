public class PrefixSum_Naive {
    static int getSum(int[] arr,int l,int r)
    {
        int res = 0;
        for (int i=l;i<=r;i++)
        {
            res = res + arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,8,3,9,6,5,4};
        int l = 1;
        int r = 3;
        System.out.println(getSum(arr,l,r));
    }
}
