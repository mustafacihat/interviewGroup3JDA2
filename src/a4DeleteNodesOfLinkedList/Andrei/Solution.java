package a4DeleteNodesOfLinkedList.Andrei;

public class Solution {

    public static Node deleteNodes(Node node, int m, int n) {

        try {
            if (m > 1000 || m < 1 || n > 1000 || n < 1 )
                throw new RuntimeException("Error message");
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        Node current = node.head;
        Node prev = node.head;

        while (prev.next != null) {
            for (int i = 0; i < n; i++)
                prev = (prev.next != null) ? prev.next : prev;
            for (int i = 0; i < m - 1; i++) {
                current = current.next;
                prev = prev.next;
            }
            if (prev == null) current.next = null;
            else {
                current.next = prev.next;
                prev.next = null;
            }
            prev = current.next;
            current = current.next;

            if (prev == null) return node;
        }
        return node;
    }


}
