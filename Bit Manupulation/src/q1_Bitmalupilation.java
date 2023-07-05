import java.util.Scanner;

public class q1_Bitmalupilation {

    // Function to check if
    //X is power of 2
    static boolean isPowerofTwo(int n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if (isPowerofTwo(n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }

}
