class Node6{
    int data;
    Node next;
    Node6(int x){
        data = x;
        next = null;
    }
}

public class KthDeletion {
    static Node deleteKth(Node head,int k)
    {
        if (head == null){
            return head;
        }
        if (k == 1){
            return deleteHead(head);

        }
        Node curr = head;
        for (int i=0;i<k-2;i++){
            curr = curr.next;
        }
        curr = curr.next.next;

        return head;
    }
    static Node deleteHead(Node head){
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
        head.next.next.next = head;

//        deleteHead(head);
//        printList(head);
//        System.out.println(deleteKth(head,2));
        head = deleteKth(head,2);
        printList(head);
    }
}
