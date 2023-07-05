import java.util.ArrayList;
import java.util.List;

public class listDeclaration {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        //Adds 1 at 0 index
        l1.add(0,1);

        //Adds 2 at 1 index
        l1.add(1,2);
        System.out.println(l1);

        //Creating Another List
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        //will add list l2 from 1 index
        l1.addAll(1,l2);
        System.out.println(l1);

        //Remove element from index1
        l1.remove(1);
        System.out.println(l1);

        //Print element at  index 3
        System.out.println(l1.get(3));

        //Replace 0th element with 5
        l1.set(0,5);
        System.out.println(l1);
    }
}
