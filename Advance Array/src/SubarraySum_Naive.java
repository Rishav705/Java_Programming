public class SubarraySum_Naive {
    static boolean isSubArr(int[] arr,int n,int sum)
    {
        for (int i=0;i<n;i++)
        {
            int curr = 0;
            for (int j=i;j<n;j++)
            {
                curr += arr[i];
                if (curr == sum)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int n = arr.length;
        int sum = 33;
        System.out.println(isSubArr(arr,n,sum));
    }
}
