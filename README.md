# Queue-ADT
A queue is a linear structure ADT that follows a particular order in which the operations are performed. The order is First In First Out (FIFO).
## Practical Examples:
- A good example of a queue is any queue of people, in a bank or a shop. Which follows the rule of comes first and gets served first.

![Queue](https://github.com/TT-talhatariq/Queue-ADT/blob/main/quue.png)


## Operations on Queue:
Following basic operations are performed on queue:
- Enqueue(): Adds an item to the queue.
- Dequeue(): Removes an item from the queue
- IsEmpty (): Queues is empty of not

All operations will be in O(1) time complexity
## Types of Queue
### 1. Priority Queue
It is like Partitions in Public Transport which have first-class, second class & Economy class section for passengers.
- [Priority Queue Code](https://github.com/TT-talhatariq/Queue-ADT/blob/main/src/pacakage/Priotityqueue.java)

 **Characterstics**
- Every item has a priority associated with it.
- An element with high priority is dequeued before an element with low priority.
- If two elements have the same priority, they are served according to their order in the queue.
### 2. Deque
It is a version of Queue that allows insert and delete at both ends.
# Implementation for Queues
There are two methods for the implementation of Queues.
### Array Based
Easy to implement, but cos is that array is of fixed size, and it can create a problem somewhere (when the queue exceeds the size of the array)
- [C++ Code](https://github.com/TT-talhatariq/Queue-ADT/blob/main/C%2B%2B/4-ArrayQueue-Bsef19a544.cpp)
- [Java Code](https://github.com/TT-talhatariq/Queue-ADT/blob/main/src/pacakage/QueueArrayBased.java)
### Linked List Based
Efficient But tricky to implement and also takes extra memory than arrays (Pointer Node)
- [C++ Code](https://github.com/TT-talhatariq/Queue-ADT/blob/main/C%2B%2B/3-LinkedQueue-Bsef19a544.cpp)
- [Java Code](https://github.com/TT-talhatariq/Queue-ADT/blob/main/src/pacakage/QueueLinkedBased.java)

### Happy Learing🙌
