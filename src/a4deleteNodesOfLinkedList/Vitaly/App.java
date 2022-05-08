package a4deleteNodesOfLinkedList.Vitaly;

import a4deleteNodesOfLinkedList.Vitaly.myLLpkg.MySinglyLinkedList;

public class  App {
    public static void main(String[] args) {
        int n = 1;
        int m = 3;

        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i= 1; i<3; i++){
            list.add(i);
        }
        list.printNodes();
        System.out.println();
        DeleteNodesAfterNodes.delNodesSkipNodes(n,m, list.head);
        System.out.println("keep :" + n + "\nskip :" + m);
        list.printNodes();
        System.out.println();
    }

}
