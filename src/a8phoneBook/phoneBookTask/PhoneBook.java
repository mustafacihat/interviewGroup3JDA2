package a8phoneBook.phoneBookTask;

import java.util.*;

public class PhoneBook {

    PNode head;
    PNode tail;
    int size;

    Map<String, PNode> nodesMap = new HashMap<>();

    public PhoneBook() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printPhoneBook() {
        PNode current = head;

        while (current != null) {
            System.out.print(current + " => ");
            current = current.next;
            if (current == null) {
                System.out.print(" null");
            }
        }
    }

    public void add(String firstName, String lastName, String email, String phoneNumber) {
        PNode newNode = new PNode(firstName, lastName, email, phoneNumber);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        nodesMap.put(email, newNode);
        size++;
    }

    public PNode findByName(String firstName) throws Exception {

        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }

        PNode current = head;
        while (current != null) {
            if (current.firstName.equals(firstName)) {
                return current;
            }
            current = current.next;
        }
        throw new Exception("No record is available in phone book");
    }

    public PNode findByUniqueValueEfficient(String email) {
        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }
        return nodesMap.get(email);
    }

    public List<PNode> findAllByLastName(String lastName) {

        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }
        List<PNode> list = new ArrayList<>();

        PNode current = head;
        while (current != null) {
            if (current.lastName.equals(lastName)) {
                list.add(current);
            }
            current = current.next;
        }
        return list;
    }

    public void deleteByName(String firstName) {
        PNode current = head;
        PNode previous = head;
        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }

        while (current != null) {
            if (current.firstName.equals(firstName)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                        current.next = null;
                    }
                } else if (current == tail) {
                    tail = previous;
                    previous.next = null;

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


    public void deleteAllMatchingLastName(String lastName) {
        PNode current = head;
        PNode previous = head;
        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }
        boolean isDeleted = false;
        while (current != null) {
            if (current.lastName.equals(lastName)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                        previous = head;
                        current.next = null;
                    }
                } else if (current == tail) {
                    tail = previous;
                    previous.next = null;

                } else {
                    previous.next = current.next;
                    current.next = null;
                }
                size--;
                isDeleted = true;
            }

            if (isDeleted) {
                current = previous.next;
                isDeleted = false;
            } else {
                previous = current;
                current = current.next;
            }

        }


    }

    public List<PNode> findAll() {
        List<PNode> allNodes = new ArrayList<>();
        PNode current = head;

        while (current != null) {
            allNodes.add(current);
            current = current.next;
        }

        return allNodes;
    }
}

//    public void deleteAllMatchingLastName(String lastName){
//        PNode current = head;
//        PNode previous = head;
//
//        if (isEmpty())
//            throw new RuntimeException("Phone Book is empty.");
//
//
//        boolean isDeleted = false;
//        while (current != null){
//            if (current.lastName.equals(lastName)){
//                if (current == head){
//                    if (size == 1){
//                        head = tail = null;
//                    }else {
//                        head = current.next;
//                        previous = head;
//                        current.next = null;
//                    }
//                }else if(current == tail){
//                    tail = previous;
//                    previous.next = null;
//                }else {
//                    previous.next = current.next;
//                    current.next = null;
//                }
//
//                size--;
//                isDeleted = true;
//            }
//            if (isDeleted){
//                current = previous.next;
//                isDeleted = false;
//            }else {
//                previous = current;
//                current = current.next;
//            }
//        }
//    }

