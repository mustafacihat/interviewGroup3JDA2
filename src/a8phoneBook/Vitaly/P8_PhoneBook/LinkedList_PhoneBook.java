package a8phoneBook.Vitaly.P8_PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class LinkedList_PhoneBook {
    public Node head;

    public boolean isEmpty() {
        return head == null;
    }


    //insert
    public void insert(Node node) {
        if (isEmpty()) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = node;
        }
    }

    //search by name
    public Node searchByName(String name) {
        if (isEmpty()) throw new RuntimeException("empty node");
        Node curr = head;
        while (curr.next != null) {
            if (curr.name == name) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }

    //find all by last name
    public List<Node> findAllByName(String name) {
        if (isEmpty()) throw new RuntimeException("empty node");
        List<Node> list = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            if (curr.name == name) {
                list.add(curr);
            }
            curr = curr.next;
        }
        return list;
    }

    //delete by name
    public void deleteByName(String name) {
        if (isEmpty()) return;
        if (head.next == null) {
            if (head.name == name) head = null;
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.name == name) {
                curr = curr.next;
                prev.next = curr;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }


    //delete all matching last name
    public void deleteByLastName(String lastName) {
        if (isEmpty()) return;
        Node curr = head;
        LinkedList_PhoneBook copy = new LinkedList_PhoneBook();
        while (curr != null) {
            if (curr.lastName != lastName)
                copy.insert(new Node(curr.name, curr.lastName, curr.email, curr.phoneNumber));
            curr = curr.next;
        }
        this.head = copy.head;
    }


    //find all
    public List<Node> findAll() {
        if (isEmpty()) return null;

        Node curr = head;
        List<Node> list = new ArrayList<>();
        while (curr != null) {
            list.add(curr);
            curr = curr.next;
        }
        return list;
    }

    //print phone book
    public void printBook() {
        if (isEmpty()) System.out.println("nothing to print");
        else {
            Node curr = head;
            while (curr != null) {
                System.out.println(curr);
                curr = curr.next;
            }
        }
    }


}
