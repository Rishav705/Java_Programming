class Node3{
    int data;
    Node next;
    Node3(int x){
        data = x;
        next = null;
    }
}
//Navie
public class InsertAtBegin {
    static Node insertBegin(Node head,int x)
    {
//        Node temp=new Node(x);
//        if(head==null)
//            temp.next=temp;
//        else{
//            Node curr=head;
//            while(curr.next!=head)
//                curr=curr.next;
//            curr.next=temp;
//            temp.next=head;
//        }
//        return temp;
     //Efficient
      Node temp = new Node(x);
      if (head == null)
      {
          temp.next = temp;
          return temp;
      }
      else{
          temp.next = head.next;
          head.next = temp;
          int t = head.data;
          head.data = temp.data;
          temp.data = t;
          return head;
      }

    }
    static void printList(Node head)
    {
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head = insertBegin(head,15);
        printList(head);
    }
}
