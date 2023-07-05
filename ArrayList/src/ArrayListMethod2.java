import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        //contain(Object)--> boolean
        //remove(index) --> object
        //remove(object) --> boolean
        ArrayList<String> al = new ArrayList<String>();
        al.add("geeks");
        al.add("ide");
        al.add("Course");

        System.out.println(al.contains("ide"));
        al.remove(1);
        System.out.println(al.contains("ide"));
        al.remove("Course");
        System.out.println(al.contains("Course"));
    }
}
