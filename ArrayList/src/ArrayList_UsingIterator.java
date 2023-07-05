import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("gfg");
        al.add("ide");
        al.add("course");

        Iterator it = al.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
    }
}
