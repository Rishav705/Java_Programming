public class SumOfArray {
    public static void sum(int[] arr)
    {
        int s = 0;
        for (int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        System.out.print(s);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sum(arr);
    }
}
