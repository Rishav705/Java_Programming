public class MaximumSub_Array {
    static int maxSum(int[] arr,int n)
    {
        int res = 0;
        for (int i=0;i<n;i++)
        {
            int curr = 0;
            for(int j =0;j<n;j++)
            {
                curr = curr + arr[j];
                res = Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        int n = arr.length;
        System.out.println(maxSum(arr,n));
    }
}
