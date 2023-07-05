import java.util.Scanner;

public class Q2_Bitmanipulkation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= 5;
        int oper=sc.nextInt();

        int pos=1;
        int bitMask=1<<pos;

        if (oper==1){
            //set
            int newNumber = bitMask|n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitMask=~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }


}
