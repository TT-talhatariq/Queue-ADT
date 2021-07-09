package pacakage;
class Linkedlist {
    static class Node {
        int data;
        Node next;

        Node() {
            data = 0;
            next = null;
        }

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node head;

    public Linkedlist() {
        head = null;
    }
    public Linkedlist(int val){
        head = new Node(val);
    }

    public void addAtHead(int val) {
        head = new Node(val);
    }

    public boolean search(int val) {

        Node cur = head;

        while (cur != null) {

            if (cur.data == val)
                return true;

            cur = cur.next;
        }
        return false;
    }

    public void insert(int val) {
        if(head == null) {
            addAtHead(val);
            return;
        }
        Node cur = head;
        while (cur.next != null)
            cur = cur.next;
        cur.next = new Node(val);
    }

    public void insertbeg(int val) {
        Node tmp = new Node(val);
        tmp.next = head;
        head = tmp;
    }

    public int count(int val) {
        int cn = 0;
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data == val)
                cn++;
            tmp = tmp.next;
        }
        return cn;
    }

    public void removevalue(int val) {
        Node tmp = head;
        Node pre = null, next = head;

        while (tmp.data != val) {
            pre = next;
            next = tmp.next;
            tmp = tmp.next;
        }
        if (tmp == null)
            return;

        pre.next = next.next;
    }
public int remove_head(){
        if(head == null)
            return 0;
        int val = head.data;
        head = head.next;
        return val;
}
    public int length() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }


    public boolean search_recu(int value) {
        return search(head, value);
    }

    public boolean search(Node head, int val) {
        if (head.data == val)
            return true;
        if (head.next == null)
            return false;

        return search(head.next, val);
    }

    public int length_recu() {
        return length_rec(head);
    }

    public int length_rec(Node head) {
        if (head == null)
            return 0;

        return 1 + length_rec(head.next);
    }
    public void print(){
        Node tmp = head;

        while(tmp!=null) {
            System.out.print(tmp.data + ", ");
            tmp = tmp.next;
        }
        System.out.print("\b\b");
    }
    public void print_rec(){
        print_recur(head);
    }
    void print_recur(Node head){
        if(head == null)
            return;
        System.out.print(head.data+ ", ");
        print_recur(head.next);
    }
    void print_middle(){
        int middle = this.length()/2;
        Node tmp = head;
        for(int i=0; i<middle; i++)
            tmp = tmp.next;
        System.out.println("Middle: " + tmp.data);
    }
    public void reverse(){
        Node prev, next, current;
        prev = null;
        next = current = head;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
