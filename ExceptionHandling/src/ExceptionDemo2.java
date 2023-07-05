import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("test.in"));

            System.out.println("Exit main()");
        }
        catch (FileNotFoundException exception)
        {
            System.out.println("File not found and caught");
        }
        finally {
            System.out.println("finally-block runs regardless of the state of exception");
        }
        System.out.println("After try-catch-finally, life goes on");
    }
}
