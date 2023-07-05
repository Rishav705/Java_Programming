import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        //get(index)
        //set(index,Object)
        //indexOf(Object)
        //lastIndexOf(Object)

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(20);

        System.out.println(al.get(1));
        al.set(1,40);

        System.out.println(al.get(1));
        System.out.println(al.indexOf(10));
        System.out.println(al.lastIndexOf(10));
        System.out.println(al.indexOf(50));
    }
}
