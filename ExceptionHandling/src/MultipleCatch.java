import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        try
        {
            methodA();
            System.out.println(new File("test.in"));
            System.out.println("Exit main");
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Arithmetic Exception caught...");
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("FileNotFoundException caught...");
        }
        catch (Exception exception)
        {
            System.out.println("A new type exception is caught...");
        }
        finally {
            System.out.println("finally-block runs regardless of the state of exception");
        }
        System.out.println("After try-catch-finally, life goes on...");
    }
    static void methodA() throws ArithmeticException
    {
        Scanner sc =new Scanner(System.in);
        int a =5, b =0,c;

        System.out.println("Enter the numeric value of b");
        int b = sc.nextInt();

        if (b == 0)
        {
            throw new ArithmeticException();
        }
        else
        {
            c = a/b ;
            System.out.println("Exit MethodA");
        }
    }
}
