class Node2{
    int data;
    Node next;
    Node2(int x)
    {
        data = x;
        next = null;
    }
}

public class TraversalDoWhile {
    static void printList(Node head)
    {
        if (head == null)
        {
            return;
        }
        Node r = head;
        do{
            System.out.print(r.data+" ");
            r = r.next;
        }while (r!=head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        printList(head);
    }
}
