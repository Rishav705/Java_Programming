public class Efficient_Solution_OneOdd {
    static int findOdd(int[] arr,int n)
    {
        int res = 0;
        for (int i=0;i<n;i++)
        {
            res = res^arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,4,4,4,5,5};
        int n = arr.length;
        System.out.println(findOdd(arr,n));
    }
}
