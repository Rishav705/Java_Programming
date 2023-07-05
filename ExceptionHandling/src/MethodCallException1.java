public class MethodCallException1 {
    public static void main(String[] args) {
        methodA();
    }
    static void methodA()
    {
        System.out.println("Enter method()");
        int a = 5 , b=0;
        int c = a/b;
        System.out.println(c);
    }
}
