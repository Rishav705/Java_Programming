public class EquilibriumPoint_Efficient {
    static int ePoint(int[] arr,int n)
    {
        int rs = 0;
        for (int i=0;i<n;i++)
        {
            rs = rs + arr[i];
        }

        int ls = 0;
        for (int i=0;i<n;i++)
        {
            rs = rs - arr[i];
            if (ls == rs)
            {
                return i;
            }
            ls = ls + arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
         int[] arr = {1,3,5,2,2};
         int n = arr.length;
        System.out.println(ePoint(arr,n));
    }
}
