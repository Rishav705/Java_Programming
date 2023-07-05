import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExaceptionDemo {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("test.in"));

            System.out.println("Exit Main()");
        }
      catch (FileNotFoundException exception)
      {
          System.out.println("File not found caught");
      }
        finally {
            System.out.println("finally-block runs regardless of the state of exception");
        }
    }
}
