//import java.util.Scanner;

import java.util.Scanner;

public class Rotate {
    static void rotateArr(int arr[],int d,int n)
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {1,2,3,4,5};
        int n = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("Before Rotation");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rotateArr(arr,d,n);

        System.out.println("After Rotation");
        for (int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
