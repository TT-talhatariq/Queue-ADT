import pacakage.Priotityqueue;
import pacakage.QueueArrayBased;
import pacakage.QueueLinkedBased;

public class Main {
    static public void main(String [] args){
      /*/Array Based
        System.out.println("Array Based Queue");
        QueueArrayBased q = new QueueArrayBased();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Elements of Queue");
        q.print();

        System.out.print("\nDeque Operation Result: ");
        System.out.println(q.dequeue());
        System.out.println("Elements of Queue");
        q.print();


        //Linked List Based
        QueueLinkedBased q2 = new QueueLinkedBased();
        System.out.println("\nLinkedList Based Queue");
        q2.enqueue(50);
        q2.enqueue(60);
        q2.enqueue(70);
        q2.enqueue(80);
        System.out.println("Elements of Queue");
        q2.display();
        System.out.print("Deque Operation Result: ");
        System.out.println(q2.dequeue());
        System.out.println("Elements of Queue");
        q2.display();


       */
        Priotityqueue p = new Priotityqueue();
        p.add(13,4);
        p.add(13,3);
        p.add(45, 2);
        p.add(63, 0);
        while (!p.isEmpty()) {
            System.out.printf("%d ", p.deque());
        }

    }
}
