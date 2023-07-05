import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        //add(objects)
        //add(index,object)
        ArrayList<String> al = new ArrayList<String>();
        al.add("geeks");
        al.add("ide");
        al.add("course");

        System.out.println(al);//print arraylist
        al.add(1,"practice"); //add practice in the arraylist
        System.out.println(al);
    }
}
