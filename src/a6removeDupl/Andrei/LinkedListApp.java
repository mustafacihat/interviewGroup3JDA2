package a6removeDupl.Andrei;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.printNodes();

        linkedList.removeDuplicate();
        System.out.println();

        linkedList.printNodes();
    }
}