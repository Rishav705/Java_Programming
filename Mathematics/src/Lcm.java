public class Lcm {
    //Naive Algorithm
    static int lcm(int a ,int b)
    {
        int res = Math.max(a,b);
        while (true)
        {
            if (res%a == 0 && res%b==0)
            {
                return res;
            }
            res++;
        }
//        return res;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(lcm(a,b));
    }
}
