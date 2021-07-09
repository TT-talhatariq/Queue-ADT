package pacakage;

public class QueueArrayBased {
    int front, rear, size, capacity;
    int [] arr;
    public QueueArrayBased(){
        this.capacity = 1000;
        arr = new int[capacity];
        rear = capacity-1;
        front = size = 0;
    }
    QueueArrayBased(int cp){
        arr = new int[capacity];
        this.capacity = cp;
        rear = capacity-1;
        front = size = 0;
    }
    boolean isFull(){
        return this.size == this.capacity;
    }
    boolean isEmpty(){
        return this.size == 0;
    }
    public void enqueue(int nbr){
        if(this.isFull()){
            System.out.print(nbr + " Can't be added into Queue, becasue it is full");
            return;
        }
        this.rear = (this.rear+1)%capacity;
        arr[rear] = nbr;
        this.size+=1;
    }

    public int dequeue(){
        if(this.isEmpty()){
            System.out.print("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        int val = arr[front];
        this.front =  (front+1)%capacity;
        return val;
    }

    public int front(){
        if(this.isEmpty()){
            System.out.print("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return arr[this.front];
    }
    public int rear(){
        if(this.isEmpty()){
            System.out.print("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return arr[this.rear];
    }
    public int getSize(){
        return size;
    }
    public void print(){
        for(int i=front; i<size; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
