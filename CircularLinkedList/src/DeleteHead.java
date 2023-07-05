class Node5{
    int data;
    Node next;
    Node5(int x)
    {
        data = x;
        next = null;
    }
}

public class DeleteHead {
    static Node delHead(Node head)
    {
        //Naive Solution
        /*
        if (head == null){
            return null;
        }
        if (head.next == head){
            return null;
        }
        Node curr = head;
        while (curr.next!=head)
            curr = curr.next;
            curr.next = head.next;

        return curr.next;

         */
        //Efficient Solution
        if (head == null){
            return null;
        }
        if (head.next == head){
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;

    }
    static void printList(Node head){
        if (head == null){
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
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        head = delHead(head);
        printList(head);

    }
}
