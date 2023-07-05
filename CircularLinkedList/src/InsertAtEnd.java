class Node4{
    int data;
    Node next;
    Node4(int x)
    {
        data = x;
        next = null;
    }
}

public class InsertAtEnd {

    static Node insertEnd(Node head,int x)
    {
        /*
        Naive Solution:-
        Node temp = new Node(x);
        if (head == null)
        {
            temp.next = temp;
            return temp;
        }
        else
        {
            Node curr = head;
            while (curr.next!=head)
                curr = curr.next;
                curr.next = temp;
                temp.next = head;

            return head;
        }

         */

        //Efficient Solution:-
        Node temp = new Node(x);
        if (head == null)
        {
            temp.next = temp;
            return temp;
        }
        else{
            temp.next = head.next;    //Inset temp after head
            head.next = temp;
            int t = temp.data;
            temp.data = head.data;     //Swapping
            head.data = t;
        }
        return temp; //temp is now new
                     //head


    }

    static void printList(Node head)
    {
        if(head==null)return;
        Node r=head;
        do{                                     //printList
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head = insertEnd(head,15);
        printList(head);
    }
}
