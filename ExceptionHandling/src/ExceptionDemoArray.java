public class ExceptionDemoArray {
    public static void main(String[] args) {
        int a;
        int b;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

            int sum = a+b;
            System.out.println("Addition is"+sum);
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Insufficient no.");
        }
    }
}
