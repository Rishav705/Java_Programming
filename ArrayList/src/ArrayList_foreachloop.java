import java.util.ArrayList;

public class ArrayList_foreachloop {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("gfg");
        al.add("ide");
        al.add("Courses");

        for (String s: al)
        {
            System.out.println(s);
        }
    }
}
