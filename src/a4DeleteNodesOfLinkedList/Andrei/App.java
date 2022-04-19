package a4DeleteNodesOfLinkedList.Andrei;

public class App {

    public static void main(String[] args) {
        Node list = new Node();
        for (int i = 1; i <= 13; i++) list.add(i);
        Solution.deleteNodes(list, 2, 3).printNodes();
    }
}
