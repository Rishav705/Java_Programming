import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {

                 //Get Bit
        /*
        int n=5;//1010
        int pos=3;
        int BitMask=1<<pos;

        if ((BitMask & n)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");


        }

         */

               //Set Bit
        /*
        int n=5;
        int pos=1;
        int BitMask=1<<pos;

        int newNumber= BitMask | n;
        System.out.println(newNumber);

         */

              //Clear Bit
        /*
        int n=5;
        int pos=2;
        int BitMask=1<<pos;

        int notBitMask= ~(BitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);

         */

                       //Update bit
        Scanner sc= new Scanner(System.in);
        int oper= sc.nextInt();
        //oper=1:set   oper=0:clear

        int n=5;//0101-> 0111-> decimal 7
        int pos=1;

        int bitMask = 1<<pos;
        if(oper==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitMask= ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
