public class LeftRotate_D {
    // Method 1
    /*
    static void LeftRotateOne(int arr[],int n)
    {
        int temp = arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1] = arr[i];

        }
        arr[n-1] = temp;
    }
    static void  LeftRotate(int arr[],int n,int  d)
    {
        for (int i=0;i<d;i++)
        {
            LeftRotateOne(arr, n);
        }
    }

     */

    //Method 2
    /*
    static void LeftRotate(int arr[],int n,int d)
    {
        int temp[] = new int[d];
        for (int i=0;i<d;i++)
        {
            temp[i] = arr[i];
        }
        for (int i=d;i<n;i++)
        {
            arr[i-d] = arr[i];
        }
        for (int i=0;i<d;i++)
        {
            arr[n-d+i] = temp[i];
        }
    }

     */

    //Reversal Algorithm
    static void LeftRotate(int arr[],int n,int d)
    {

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int low, int high)
    {
        while(low<high)
        {
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int n =5;
        int d =2;

        System.out.println("Before Rotation");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        LeftRotate(arr,n,d);

        System.out.println("After Rotation");
        for (int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
