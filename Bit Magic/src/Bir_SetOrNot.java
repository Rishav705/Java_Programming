public class Bir_SetOrNot {
    static void kthBit(int n,int k)
    {
        //left shift
//        if ((n & (1 << (k - 1)))!= 0)
//            System.out.print("SET");
//        else
//            System.out.print("NOT SET");

        //Right shift
        if (((n >> (k - 1)) &
                1) == 1)
            System.out.println("SET");
        else
            System.out.println("NOT SET");
    }

    public static void main(String[] args) {
        int n = 13;
        int k = 3;
        kthBit(n,k);
    }
}
