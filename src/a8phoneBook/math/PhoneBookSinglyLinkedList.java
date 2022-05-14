package a8phoneBook.math;

import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PhoneBookSinglyLinkedList<T> implements PhoneBookAbs<PhoneBook> {
    Node head;
    Node tail;
    int size;


    //if it s empty return true
    boolean isEmpty() {
        return head == null;
    }

    @Override
    public void insert(PhoneBook pbook) {
        Node node = new Node(pbook);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }


    @Override
    public void insertAll(Stream<PhoneBook> stream) {
        List list = stream.collect(Collectors.toList());
        int i = 0;
        while (i < list.size()) {
            Node node = new Node(list.get(i));
            if (isEmpty()) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            i++;
            size++;
        }
    }

    @Override
    public List<PhoneBook> findAll() {
        List<PhoneBook> list = new ArrayList<>();
        Node<PhoneBook> current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list;
    }


    public Node<PhoneBook> findByName(String name) {
        Node<PhoneBook> current = head;
        PhoneBook phone;
        while (current != null) {
            if (current.value.getName().equals(name)) {
                return current;
            }
            current=current.next;
        }
        return null;
    }

    @Override
    public List<PhoneBook> findAllByLastName(String lastName) {
        List<PhoneBook> list = new ArrayList<>();
        Node<PhoneBook> current = head;
        while (current != null) {
            if(current.value.getLastName().equals(lastName)){
                list.add(current.value);
            }
            current = current.next;
        }

        return list;
    }


    @Override
    public void deleteByName(String objField) {
        Node<PhoneBook> current = head;
        Node<PhoneBook> previous = head;

        if (isEmpty()) {
            System.out.println("There is nothing to delete here");
        }

        while (current != null) {
            if (current.value.getName() == objField) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.next = current.next;
                    current.next = null;

                }
                size--;
                break;
            }
            previous = current;
            current = current.next;
        }

    }

    @Override
    public void deleteAllMatchingLastName(String objField) {
        Node<PhoneBook> current = head;
        Node<PhoneBook> previous = head;

        if (isEmpty()) {
            System.out.println("There is nothing to delete here");
        }

        while (current != null) {
            if (current.value.getLastName() == objField) {
                if (current == head) {
                    head = current.next;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.next = current.next;
                }
                size--;

            }
            previous = current;
            current = current.next;
        }
    }


    @Override
    public void printAll() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.println(current.value + "=>null");
            } else {
                System.out.println(current.value + "=>");
            }
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public void printName() {
        Node<PhoneBook> current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.value.getName() + "=>null");
            } else {
                System.out.print(current.value.getName() + "=>");
            }
            current = current.next;
        }
        System.out.println();


    }

    @Override
    public void printNode(Node<PhoneBook> node) {
        System.out.println(node.value.toString());
    }
}
/**
 * Tasks:
 * 1. Implement a phone book using linked list structure. In this phone book you are going to store name, last name, email and phone number.
 * 2. Implement an insert operation to the phone book. With the insert operation your going to add name, last name, email and phone number of the person.
 * 3. Implement following methods:
 * • findByName: Will return the information of the first record matching the
 * name you send.
 * • FindAllByLastName: Will return an ArrayList of all entries matching the Last
 * name you send.
 * • deleteByName: Will delete the first record matching the name you send to
 * this method.
 * • deleteAllMatchingLastName: Will delete all entries matching the Last name
 * you send.
 * • findAll: Return all records as an ArrayList.
 * • printPhoneBook: will print all entries in the phone book.
 */