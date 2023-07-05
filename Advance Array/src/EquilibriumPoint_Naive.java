public class EquilibriumPoint_Naive {
    static boolean ePoint(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int l = 0, r = 0;
            for (int j=0;j<i;j++)
            {
                l = l + arr[j];
            }
            for (int k = i+1; k<n;k++)
            {
                r = r + arr[k];
            }
            if (l == r)
            {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,8,-9,20,6};
        int n = arr.length;
        System.out.println(ePoint(arr,n));
    }
}
