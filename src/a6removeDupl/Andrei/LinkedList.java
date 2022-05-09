package a6removeDupl.Andrei;
import java.util.Objects;

public class LinkedList {

    Node head;
    Node tail;

    void removeDuplicate() {
        Node prev = head;
        Node current = prev.next;

        while (current != null) {
            prev.next = (Objects.equals(prev.value, current.value)) ? current.next : prev.next;
            prev = (!Objects.equals(prev.value, current.value)) ? current : prev;
            current = current.next;
        }
    }

    void add(int data) {
        Node node = new Node(data);
        if (head == null) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.value + "=> null");
            } else {
                System.out.print(current.value + "=>");
            }
            current = current.next;
        }
    }
}