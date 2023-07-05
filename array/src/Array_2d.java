import java.util.Scanner;

public class Array_2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        int rows=sc.nextInt();
        System.out.println("enter the colums");
        int cols=sc.nextInt();

        int number[][]=new int[rows][cols];

                      //inputs
        System.out.println("enter the values");

        //rows
        for (int i=0;i<rows;i++){

            // colums
            for (int j=0;j<cols;j++){
                number[i][j]=sc.nextInt();

            }
        }
        System.out.println("your outputs are:");
        //output
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }


    }
}
