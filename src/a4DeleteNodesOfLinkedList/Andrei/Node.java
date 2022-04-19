package a4DeleteNodesOfLinkedList.Andrei;

public class Node {
    int value;
    Node next;
    Node head;
    Node tail;
    int size;

    public Node(int value) {
        this.value = value;
    }

    public Node() {
    }

    void add(int data) {
        Node node = new Node(data);
        if (head == null) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.print(current.value + "=> null");
            else System.out.print(current.value + "=>");
            current = current.next;
        }
        System.out.println();
    }
}

