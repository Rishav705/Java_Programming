import java.util.Arrays;
public class Fill {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
//        Arrays.fill(arr,-1);
        Arrays.fill(arr,1,3,-1);
        System.out.println(Arrays.toString(arr));
    }
}
