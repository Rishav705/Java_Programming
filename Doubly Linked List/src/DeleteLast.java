class Node6{
    int data;
    Node prev;
    Node next;
    Node6(int d)
    {
        data = d;
        prev = next = null;
    }
}

public class DeleteLast {
    static Node delEnd(Node head)
    {
        if (head == null)
        {
            return null;
        }
        if (head.next == null)
        {
            return null;
        }
        Node curr = head;
        while (curr.next!=null)
        {
            curr = curr.next;
        }
        curr.prev.next = null;

        return head;
    }
    public static void printList(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = delEnd(head);
        printList(head);
    }
}
