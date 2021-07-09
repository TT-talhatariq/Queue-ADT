package pacakage;

public class QueueLinkedBased extends Linkedlist {
    Node front;
    Node rear;
    int size;
    public QueueLinkedBased() {
        super();
        size = 0;
        front = rear = null;
    }

    boolean isEmpty(){
        return front == null;
    }
   public void enqueue(int nbr){
        if(front == null){
            insert(nbr);
            front = rear = head;
            size++;
            return;
        }
        insert(nbr);
        rear = rear.next;
    }

   public int dequeue(){
        if(front == null){
            System.out.print("Queue is Empty");
        }
        size--;
        front = head.next;
        return remove_head();
    }

    public int front(){
        if(front == null){
            System.out.print("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }
    public int rear(){
        if(front == null){
            System.out.print("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return rear.data;
    }
    public int getSize(){
        return size;
    }
    public void display(){
        Node tmp = front;
        while (tmp!=null){
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
    }

}
