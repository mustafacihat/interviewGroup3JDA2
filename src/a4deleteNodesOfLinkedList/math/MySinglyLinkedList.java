package a4deleteNodesOfLinkedList.math;

public class MySinglyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //not change m node then delete n node repeatedly
    public Node<T> stayMeRemoveN(Node<T> head, int m, int n) {

        Node<T> pointer = head;
        Node<T> current = head;
        int counter = 0;
        Node<T> previous = null;
        while (pointer != null) {

            if (counter == m + n) counter = 0; //  counter will be 0 after every m+n
            if (counter < m) {  // up to m counter  n pointer iterating and  saving previous

                previous = current;
                current = current.next;//actually we dont need it while we are binding same reference with pointer
                pointer = pointer.next;
                counter++;

            } else  {
                previous.next = current.next; //assigning the previous.next  n time current next without changing current
                pointer = pointer.next;
                size--;
                counter++;
            }
            //assigning the next reference to our real current and we are sending  deleting nodes garbage collection
            current = previous.next;
        }

        return head;
    }


    // Check is empty is true return true else false
    boolean isEmpty() {
        return head == null;
    }


    void myAdd(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void myPrintNodes() {
        Node<T> current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.value + "=> null");
            } else {
                System.out.print(current.value + "=>");
            }
            current = current.next;

        }
        System.out.println();

    }


}
