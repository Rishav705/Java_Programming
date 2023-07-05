public class Efficent_MaxSubArray {
    static int maxSum(int[] arr,int n)
    {
        int res = arr[0];
        int max = arr[0];
        for (int i=0;i<n;i++)
        {
            max = Math.max(max+arr[i],arr[i]);
            res = Math.max(res,max);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-1,2};
        int n = arr.length;
        System.out.println(maxSum(arr,n));
    }
}
