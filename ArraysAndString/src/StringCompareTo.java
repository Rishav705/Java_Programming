public class StringCompareTo {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "for";

        int res = s1.compareTo(s2);
        if (res==0)
        {
            System.out.println("same");
        }
        if (res>0)
        {
            System.out.println("s1 Greater");
        }
        if (res<0)
        {
            System.out.println("s1 smaller");
        }
    }
}
