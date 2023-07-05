public class Count_Digit {
    static int count_digit(int x)
    {
        int res = 0;
        while(x>0)
        {
            x = x/10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 123;
        System.out.println(count_digit(x));
    }
}
