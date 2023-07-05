import java.util.ArrayList;

public class ArrayList_foreachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(5);

        al.forEach(x->System.out.println(x));
    }
}
