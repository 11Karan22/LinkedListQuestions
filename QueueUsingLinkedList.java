class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        next = null;
    }
}

class Queue {
    QueueNode front, rear;
    int size;

    Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    void enqueue(int data) {
        QueueNode temp = new QueueNode(data);
        if (front == null) {
            front = temp;
            rear = temp;
            size++;
            return;
        }
        rear.next = temp;
        rear = temp;
        size++;
    }

    void deque() {
        if (front == null) {
            return;
        }
        front = front.next;
        //check if it is the last node
        if (front == null) {
            rear = null;//then need to change rear as well
        }
        size--;
    }

    int getSize() {
        return size;
    }

    int getFront() {
        if (front == null) {
            return Integer.MAX_VALUE;
        }
        return front.data;
    }


}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(10);
        q.deque();
        q.enqueue(15);
        System.out.println(q.getSize());
        System.out.println(q.getFront());
    }
}
