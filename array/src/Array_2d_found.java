import java.util.Scanner;

public class Array_2d_found {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows:");
        int rows=sc.nextInt();
        System.out.println("enter teh colums:");
        int cols=sc.nextInt();

        int number[][]=new int[rows][cols];
                    //inputs
        System.out.println("enter the inputs:");
        //rows
        for (int i=0;i<rows;i++){
            //colums
            for (int j=0;j<cols;j++){
                number[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the values which you want to find:");
        int x= sc.nextInt();
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                //compare with x
                if (number[i][j]==x){
                    System.out.println("x found at location("+i+","+j+")");
                }
            }
        }

    }
}
