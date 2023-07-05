import java.util.Scanner;

public class isArraySorted {
    public static boolean isSorted(int[] arr,int n)
    {
        for (int i=1;i<n;i++)
        {
            if (arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        System.out.println("Enter the element of array");
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean ans = isSorted(arr,n);
        if (ans == true)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
