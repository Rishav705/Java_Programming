public class Frequencies {
    static  void printFreq(int arr[],int n)
    {
        int feq = 1, i=1;
        while(i<n)
        {
            while(i<n && arr[i] == arr[i-1])
            {
                feq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+feq);
            i++;
            feq = 1;
        }

    }

    public static void main(String[] args) {
        int arr[] ={10,10,10,30,30,40};
        int n =6;
        printFreq(arr,n);
    }
}
