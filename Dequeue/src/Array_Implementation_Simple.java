class Dequeue
{
    int size,cap;
    int[] arr;
    Dequeue(int c)
    {
        cap = c;
        size = 0;
        arr = new int[cap];
    }

    boolean isFull()
    {
        return (size == cap);
    }
    boolean isEmpty()
    {
        return (size == 0);
    }
    void insertRear(int x)
    {
        if (isFull())
        {
            return;
        }
        arr[size] = x;
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
            return (size-1);
        }
    }
    void insertFront(int x)
    {
        if (isFull())
        {
            return;
        }
        for(int i= size-1;i>=0;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = x;
        size++;
    }
    void deleteFront()
    {
        if (isEmpty())
        {
            return;
        }
        for (int i=0;i<size-1;i++)
        {
            arr[i] = arr[i+1];
            size--;
        }
    }
    int getFront()
    {
        if (isEmpty())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}


public class Array_Implementation_Simple {
    public static void main(String[] args) {
        Dequeue dq = new Dequeue(4);
        dq.insertFront(10);
        dq.insertRear(20);
        dq.insertFront(30);
        dq.insertRear(50);
        dq.deleteFront();
        dq.deleteRear();
        System.out.println(dq.getFront());
        System.out.println(dq.getRear());
    }
}
