package a8phoneBook.math;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneBookDoublyLinkedList<T>  implements PhoneBookAbs<PhoneBook>{
    Node2 head;
    Node2 tail;
    int size;
    //if it s empty return true
    boolean isEmpty() {
        return head == null;
    }

    @Override
    public void insert(PhoneBook phoneBook) {
        Node2<PhoneBook> insert = new Node2<>(phoneBook);
        if(head == null) {
            head = insert;
            tail = insert;
            insert.next = null;
            insert.prev = null;
        } else {
            tail.next = insert;
            insert.next = null;
            insert.prev = tail;
            tail = insert;
        }

    }

    @Override
    public void insertAll(Stream<PhoneBook> stream) {
        List list = stream.collect(Collectors.toList());
        int i = 0;
        while (i < list.size()) {
            Node2<PhoneBook> insert = new Node2(list.get(i));
            if(isEmpty()) {
                head = insert;
                tail = insert;
                insert.next = null;
                insert.prev = null;
            } else {
                tail.next = insert;
                insert.next = null;
                insert.prev = tail;
                tail = insert;
            }
            i++;
        }
    }

    @Override
    public List<PhoneBook> findAll() {
        List<PhoneBook> list = new ArrayList<>();
        Node2<PhoneBook> current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list;
    }


    public Node2<PhoneBook> findByName(String name) {

        Node2<PhoneBook> current = head;
        while (current != null) {
            if (current.value.getName().equals(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public List<PhoneBook> findAllByLastName(String lastName) {
        List<PhoneBook> list = new ArrayList<>();
        Node2<PhoneBook> current = head;
        while (current != null) {
            if(current.value.getLastName().equals(lastName)){
                list.add(current.value);
            }
            current = current.next;
        }

        return list;
    }

    @Override
    public void deleteByName(String name) {
        Node2<PhoneBook> current = head;
        Node2<PhoneBook> previous = head;

        if (isEmpty()) {
            System.out.println("There is nothing to delete here");
        }

        while (current != null) {
            if (current.value.getName() == name) {
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
    public void deleteAllMatchingLastName(String lastName) {
        Node2<PhoneBook> current = head;
        Node2<PhoneBook> previous = head;

        if (isEmpty()) {
            System.out.println("There is nothing to delete here");
        }

        while (current != null) {
            if (current.value.getLastName() == lastName) {
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
        Node2<PhoneBook> current = head;
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
        Node2<PhoneBook> current = head;
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
