import java.util.ArrayList;

public class Arraytlist_Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<100;i++)
        {
            al.add(i);
        }
        System.out.println(al);
//        al.ensureCapacity(100);
//        System.out.println(al);
    }
}
