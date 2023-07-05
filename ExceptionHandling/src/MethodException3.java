public class MethodException3 {
    public static void main(String[] args) {
        try{
            method();
            System.out.println("Exit main()");
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Arithmetic caught.....");
            exception.printStackTrace();
        }
    }
    static void method()
    {
        System.out.println("Enter method()");
        int a = 5, b =0;
        int c = a/b;
        System.out.println(c);
    }
}
