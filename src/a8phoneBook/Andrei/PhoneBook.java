package a8phoneBook.Andrei;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    Node head;

    Node tail;

    void add(Contact contact) {
        Node node = new Node(contact);
        if (head == null) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }

    void print() {
        Node current = head;
        if (current == null) System.out.println("Empty phone book");
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.contact.getFirstName() + " => null");
            } else {
                System.out.print(current.contact.getFirstName() + " => ");
            }
            current = current.next;
        }
        System.out.println();
    }


    Node findByName(String firstName) {
        Node current = head;
        while (current.next != null) {
            if (current.contact.getFirstName().equalsIgnoreCase(firstName)) {
                return current;
            }
            current = current.next;
        }
        throw new RuntimeException(firstName + " does not exist in the phone book");
    }

    List<String> findAllByLastName(String lastName) {
        List<String> list = new ArrayList<>();
        Node current = head;

        while (current != null) {
            if (current.contact.getLastName().equalsIgnoreCase(lastName)) {
                list.add(current.contact.getLastName());
            }
            current = current.next;
        }
        if (list.isEmpty()) System.out.println("No " + lastName + " Contacts in phone book");
        return list;
    }

    void deleteByName(String firstName) {
        Node prev = head;
        Node current = head;

        while (current != null) {
            String NodeName = current.contact.getFirstName();
            if (NodeName.equalsIgnoreCase(firstName)) {
                if (current == head) {
                    head = current.next;
                    // current.next = null;
                } else if (current.next == tail) {
                    tail = prev;
                    // prev.next = null;
                } else {
                    prev.next = current.next;
                    // current.next = null;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
        throw new RuntimeException(firstName + " does not exist on the phone book");
    }

    void deleteAllMatchingLastName(String lastName) {
        Node current = head;
        while (current != null) {
            String nodeName = current.contact.getLastName();
            if (nodeName.equalsIgnoreCase(lastName)) {
                this.deleteByName(current.contact.getFirstName());
            }
            current = current.next;
        }

    }

    List<Node> findAll() {
        List<Node> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }
        if (list.isEmpty()) System.out.println("Phone book is Empty");
        return list;
    }


}
