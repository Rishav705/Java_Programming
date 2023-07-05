public class OneOddOcuring {
    static void findOdd(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j=0;j<n;j++)
            {
                if(arr[j] == arr[i] )
                {
                    count++;
                }
            }
            if (count%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {4,3,4,4,4,5,5};
        int n = arr.length;
        findOdd(arr,n);
    }
}
