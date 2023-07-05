import java.util.Scanner;

public class TakingInput_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i=0; i<n;i++){
            System.out.println("Enter element at"+i+"th element");
            arr[i] = sc.nextInt();
        }

        for (int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
