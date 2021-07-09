package pacakage;
public class Priotityqueue {
    static class Node {
        int data;
        Node next;
        int priority;
        Node() {
            data = 0;
            priority = 0;
            next = null;
        }
        Node(int val, int p) {
            data = val;
            next = null;
            priority = p;
        }

    }

    Node head;

    public Priotityqueue() {
        head = null;
    }
    public void add (int val, int p){
        if(head == null){
            head = new Node(val, p);
        }
        else {
            Node newnode = new Node(val, p);
            Node tmp = head;
            if(head.priority > newnode.priority){
                newnode.next = head;
                head = newnode;
            }
            else {
                while (tmp.next !=null && tmp.next.priority < newnode.priority)
                    tmp = tmp.next;

                newnode.next = tmp.next;
                tmp.next = tmp;
            }


        }
    }

    public int deque() {
        int val = head.data;
        head = head.next;
        return val;
    }

    public int peek(){
        return head.data;
    }

    public boolean isEmpty() {
        return head==null;
    }

}
