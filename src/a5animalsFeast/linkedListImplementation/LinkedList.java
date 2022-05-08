package a5animalsFeast.linkedListImplementation;

import java.util.NoSuchElementException;

public class LinkedList {

    Node head;
    Node tail;

    int size;


    public void insert(int data) {
        //create a new node will be inserted the tail of our linkedList
        Node node = new Node(data);

        if (head == null) {
            //if the LinkedList is null add the new node as both head and tail
            head = tail = node;
        } else {
            //if we have already either one or more than one node inside the linked-list, add the new one to the end of the linked-list
            tail.next = node;
            tail = node;
        }
        //and increase the number of nodes in linked-list
        size++;
    }

    public void printNodes() {
        //assign the value of head to the current for tracking the all nodes one by one
        Node current = head;

        //unless the current is null, traverse all nodes one by one
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.value + "-> null");
            } else {
                System.out.print(current.value + "->");
            }
            current=current.next;
        }
    }

    public void delete(int value) {
        //if we do not have any node with that specific value then throw exception
        if (head == null) {
            throw new NoSuchElementException("No node with this value");
        }

        //assign the value of head to current for traversing all nodes needed
        Node current = head;
        //keep the information of previous node value for combining the next value of deleted node to the previous one. Current will not hold that information
        Node prev = head;
        while (current != null) {
            //check the parameterized values equals to the current value
            if (current.value == value) {

                //if the value is matched check if current is head
                if (current == head) {
                    head = current.next;
                    current.next = null;
                    //if the value is matched check if current is tail
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                    //if the value is matched check the related node is middle of the linked-list
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
                break;
            }
            prev = current;
            current = current.next;
        }
    }
}
