class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Mystack {
    Node head;
    int size;

    Mystack() {
        head = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int x) {
        //insert node at the start of linkedList
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    int peek() {
        if (head == null) {
            return Integer.MAX_VALUE;
        }
        return head.data;
    }
}

public class StackUsingLinkedList {

    public static void main(String[] args) {
        Mystack st = new Mystack();
        st.push(10);
        st.push(20);
        st.pop();
        st.push(40);
        st.peek();
        System.out.println(st.size());
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
