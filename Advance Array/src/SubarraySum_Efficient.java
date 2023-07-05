public class SubarraySum_Efficient {
    static boolean sum(int[] arr,int n,int sum)
    {
        int s = 0,curr = 0;
        for (int i=0;i<n;i++)
        {
            curr = curr + arr[i];
            while (sum < curr)
            {
                curr = curr - arr[s];
                s++;
            }
            if (curr == sum)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4,8,12,5};
        int n = arr.length;
        int sum = 17;
        System.out.println(sum(arr,n,sum));
    }
}
