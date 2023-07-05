public class MaxValue {
    public static void maximum(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++)
        {
            if (max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr ={5,8,9,2};
        maximum(arr);
    }
}
