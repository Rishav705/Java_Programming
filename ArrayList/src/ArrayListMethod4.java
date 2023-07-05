import java.util.ArrayList;

public class ArrayListMethod4 {
    public static void main(String[] args) {
        //clear()
        //isEmpty()
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
    }
}
