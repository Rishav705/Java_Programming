class Dequeue1
{
    int[] arr;
    int front,size,cap;

    Dequeue1(int c)
    {
        arr = new int[c];
        cap = c;
        front = 0;
//        rear = 0;
        size = 0;
    }
    boolean isFull()
    {
        return (size == cap);
    }
    boolean isEmpty()
    {
        return (size == 0);
    }
    void deletefront()
    {
        if (isEmpty())
        {
            return;
        }
        front = (front+1)%cap;
        size--;
    }
    void insertRear(int x)
    {
        if (isFull())
        {
            return;
        }
        int new_rear = (front+size)%cap;
        arr[new_rear] = x;
        size++;
    }
    int getFront()
    {
        if (isEmpty())
        {
            return -1;
        }
        else
        {
            return front;
        }
    }
    void insertFront(int x)
    {
        if (isFull())
        {
            return;
        }
        front = (front + cap -1)% cap;
        size++;
    }
    void deleteRear()
    {
        if (isEmpty())
        {
            return;

        }
        size--;
    }
    int getRear()
    {
        if (isEmpty())
        {
            return -1;
        }
        else
        {
            return (front+size-1)%cap;
        }
    }
}



public class Array_Implementation_Efficient {
    public static void main(String[] args) {
        Dequeue1 dq = new Dequeue1(3);
        dq.insertRear(10);
        dq.insertFront(20);
        dq.insertRear(40);
        dq.deleteRear();
        dq.deletefront();
        System.out.println(dq.getFront());
        System.out.println(dq.getRear());
    }
}
