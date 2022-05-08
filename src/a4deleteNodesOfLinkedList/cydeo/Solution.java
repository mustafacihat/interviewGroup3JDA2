package a4deleteNodesOfLinkedList.cydeo;

public class Solution {

    /**
     * 1474. Delete N Nodes After M Nodes of a Linked List (Leetcode)
     * Easy
     * You are given the head of a linked list and two integers m and n.
     * Traverse the linked list and remove some nodes in the following way:
     * • Start with the head as the current node.
     * • Keep the first m nodes starting with the current node.
     * • Remove the next n nodes
     * • Keep repeating steps 2 and 3 until you reach the end of the list.
     * Return the head of the modified list after removing the mentioned nodes.
     */

    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addNode(new ListNode(1));
        linkedList.addNode(new ListNode(2));
        linkedList.addNode(new ListNode(3));
        linkedList.addNode(new ListNode(4));
        linkedList.addNode(new ListNode(5));
        linkedList.addNode(new ListNode(6));
        linkedList.addNode(new ListNode(7));
        linkedList.addNode(new ListNode(8));
        linkedList.addNode(new ListNode(9));
        linkedList.addNode(new ListNode(10));
        linkedList.addNode(new ListNode(11));
        linkedList.addNode(new ListNode(12));
        linkedList.addNode(new ListNode(13));

        linkedList.print();

        //deleteNodes(linkedList.head, 1, 3);
        deleteNAfterMNodes(linkedList.head,1,3);

        System.out.println("\n===============");
        linkedList.print();


    }

    //solution-1
    public static ListNode deleteNodes(ListNode node, int m, int n) {

        ListNode current = node;

        while (current != null) {

            for (int i = 1; i < m; i++) {
                current = current.next;
            }

            if (current != null) {
                ListNode lastNode = current;
                for (int i = 0; i <= n && current != null; i++) {
                    current = current.next;
                }
                lastNode.next = current;
            }
        }


        return node;
    }

    //solution-2
    public static ListNode deleteNAfterMNodes(ListNode head, int m, int n) {
        ListNode pointer1 = head;
        ListNode pointer2;

        while (pointer1 != null) {
            for (int i = 1; i < m && pointer1.next != null; i++) {
                pointer1 = pointer1.next;
            }
            pointer2 = pointer1.next;

            for (int i = 1; i <= n && pointer2 != null; i++) {
                pointer2 = pointer2.next;
            }
            pointer1.next = pointer2;
            pointer1 = pointer2;
        }
        return head;
    }

}
