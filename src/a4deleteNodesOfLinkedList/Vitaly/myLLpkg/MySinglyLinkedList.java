package a4deleteNodesOfLinkedList.Vitaly.myLLpkg;

public class MySinglyLinkedList {
    public Node head;
    Node tail;
    int size;

    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        //create a node with data value
        Node node = new Node(data);
        //check if empty
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail= tail.next;
        }
    }

    public void printNodes() {
        Node current = head;
        while (current != null) {
            //last case
            if (current.next == null) System.out.print(current.value + "=> null");
            else System.out.print(current.value + "=>");
            current = current.next;
        }
    }


    void deleteNode(int value) {
        if (isEmpty()) System.out.println("no values");
        Node current = head;
        Node prev = head;
        while (current != null) {

            if (current.value == value) {
                //delete first
                if (current == head) head = current.next;
                    //delete first//delete first
                else if (current == tail) {
                    prev = tail;
                    tail.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }

            }
            prev = current;
            current = current.next;
            size--;

        }


    }


    int indexOf(int value) {
        int pos = 0;
        Node current = head;
        if (isEmpty()) return -1;
        while (current != null) {
            if (current.value == value) return pos;
            pos++;
            current = current.next;
        }
        return -1;

    }

    public int getKthFromLast(int k){
        Node ptr1 = head;
        Node ptr2 = head;

        for(int i = 0; i<k-1; i++){
            ptr2 = ptr2.next;
        }

        while (ptr2.next!=null){
            ptr1 = ptr1.next;
            ptr2= ptr2.next;
        }
        return ptr1.value;

    }

    public void removeKthFromLast(int k){
        Node ptr1 = head;
        Node ptr2 = head;

        for(int i = 0; i<=k-1; i++){
            ptr2 = ptr2.next;
        }

        while (ptr2.next!=null){
            ptr1 = ptr1.next;
            ptr2= ptr2.next;
        }
//        if
        ptr1.next=ptr2;

    }



}
