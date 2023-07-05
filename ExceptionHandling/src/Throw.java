import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        try
        {
            methodA();
            System.out.println("Exit try main()");
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Arithmetic Exception caught.....");
            exception.printStackTrace();
        }
        System.out.println("Exit main successfully");
    }
    static void methodA() throws ArithmeticException
    {
        Scanner sc = new Scanner(System.in);
        int a = 5,b = 0,c;
        System.out.println("Enter new numeric value of b");
        b = sc.nextInt();

        if (b == 0)
        {
            throw new ArithmeticException();
        }
        else
        {
            System.out.println("Exit methodA");
        }
    }
}
