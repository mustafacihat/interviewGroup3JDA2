package a4deleteNodesOfLinkedList.Vitaly;


import a4deleteNodesOfLinkedList.Vitaly.myLLpkg.Node;

public class DeleteNodesAfterNodes {
    public static Node delNodesSkipNodes(int n, int m, Node head) {
        Node temp = head;                                                       //create temp node to traverse over the LL
        Node lastToKeep = null;                                                 //to keep track of pointer for the last valid node
        while (temp != null) {
            if ((temp.value % (n + m)) == n) lastToKeep = temp;                 // condition to mark last valid node
            if ((temp.value>n)&&(temp.value%(n+m))==1) lastToKeep.next = temp;  // condition to mark first valid node , after skipping a few
            temp = temp.next;                                                   // iteration
        }
        lastToKeep.next = null;
        return head;
    }
}
