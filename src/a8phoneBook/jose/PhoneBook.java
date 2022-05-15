package a8phoneBook.jose;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

//• Be ready to do the following in your mentor session by sharing your screen with your group.
//
//            Tasks:
//            1. Implement a phone book using linked list structure. In this phone book you are going to store name, last name, email and phone number.
//            2. Implement an insert operation to the phone book.
//               With the insert operation you are going to add name, last name, email and phone number of the person.
//            3. Implement following methods:
//              • findByName: Will return the information of the first record matching the name you send.
//              • FindAllByLastName: Will return an ArrayList of all entries matching the Last name you send.
//              • deleteByName: Will delete the first record matching the name you send to this method.
//              • deleteAllMatchingLastName: Will delete all entries matching the Last name you send.
//              • findAll: Return all records as an ArrayList.
//              • printPhoneBook: will print all entries in the phone book.
//
//    Discussion:
//            • Discuss the following after you do the above task.
//              1. What is the time complexity of above operations?
//              2. How can we come up with O(1) with findByName operation? Implement a HashMap with key "name" and value "phone-record"

    public static void main(String[] args) {
        LinkedList phoneBook = new LinkedList();

        phoneBook.insert("Pepe","Garcia","pepe@pepe.com","908514908415");
        phoneBook.printPhoneBook();
        phoneBook.insert("Manolo","Dominguez","manolo@pepe.com","6565564564");
        phoneBook.printPhoneBook();
        phoneBook.insert("Coco","Garcia","coco@pepe.com","3465645");
        phoneBook.printPhoneBook();
//        phoneBook.deleteByName("Manolo");
//        phoneBook.deleteAllMatchingLastName("Garcia");
        phoneBook.printPhoneBook();

        System.out.println();
        System.out.println("findAll");
        System.out.println(phoneBook.findAll());
    }

}


class LinkedList {

    Node head;
    Node tail;

    public void insert(String firstName, String lastName, String email, String phone){ // O(1) space , O(1) time

        Node newNode = new Node(firstName, lastName, email, phone);

        // Empty
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findByName(String firstName){ // O(1) space , O(n) time
        if (head == null) return null;

        Node current = head;
        while (current != null){

            if (current.firstName.equalsIgnoreCase(firstName)) return current;
            current.next = current;
        }
        return null;
    }

    public List<Node> findAllByLastName(String lastName){ // O(1) space , O(n) time
        List<Node> list = new ArrayList<>();

        if (head == null) return list;

        Node current = head;

        while (current != null){
            if (current.firstName.equalsIgnoreCase(lastName)) list.add(current);
            current.next = current;
        }

        return list;
    }

    public Node deleteByName(String firstName){ // O(1) space , O(n) time
        if (head == null) return null;

        Node current = head;
        Node previous = head;

        while (current != null){

            if (current.firstName.equalsIgnoreCase(firstName)){
                if (current == head) {
                    head = head.next;
                    return current;
                } else if (current == tail){
                    previous.next = null;
                    tail = previous;
                    return current;
                } else {
                    previous.next = current.next;
                    return current;
                }
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    public List<Node> deleteAllMatchingLastName(String lastName){ // O(1) space , O(n) time
        List<Node> list = new ArrayList<>();
        if (head == null) return list;

        Node current = head;
        Node previous = head;

        while (current != null){

            if (current.lastName.equalsIgnoreCase(lastName)){
                if (current == head) {
                    head = head.next;
                    list.add(current);
                } else if (current == tail){
                    previous.next = null;
                    tail = previous;
                    list.add(current);
                } else {
                    previous.next = current.next;
                    list.add(current);
                }
            }
            previous = current;
            current = current.next;
        }

        return list;
    }

    public List<Node> findAll(){ // O(1) space , O(n) time
        List<Node> list = new ArrayList<>();
        if (head == null) return list;

        Node current = head;

        while (current != null){
            list.add(current);
            current = current.next;
        }

        return list;
    }

    public void printPhoneBook(){ // O(1) space , O(n) time
        System.out.println();
        Node current = head;

        if (head == null) return;

        while (current.next != null){
            System.out.print(current.toString() + " -> ");
            current = current.next;
        }

        System.out.print(current.toString() + " -> null");
    }
}

class Node {
    String firstName;
    String lastName;
    String email;
    String phone;
    Node next;

    public Node(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Node{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
