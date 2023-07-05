import java.util.ArrayList;

public class ArrayList_Traversal {
    public static void main(String[] args) {
        //Using get()
        ArrayList<String> al = new ArrayList<String>();
        al.add("gfg");
        al.add("ide");
        al.add("Course");
        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}
