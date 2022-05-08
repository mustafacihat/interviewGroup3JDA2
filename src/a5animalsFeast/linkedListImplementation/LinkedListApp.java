package a5animalsFeast.linkedListImplementation;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 6; i++) {
            linkedList.insert(i);
        }

        linkedList.printNodes();

        linkedList.delete(5);
        linkedList.delete(2);

        System.out.println();
        linkedList.printNodes();
    }
}
