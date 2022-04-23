package a4deleteNodesOfLinkedList.cydeo;

public class SinglyLinkedList {

    ListNode head;
    ListNode tail;


    public void addNode(ListNode node) {
        if (head==null){
            head=tail=node;
        }else{
            tail.next=node;
            tail=node;
        }
    }

    public void print() {
        ListNode current = head;

        while(current!=null){
            System.out.print(current.value + " ");
            current=current.next;
        }
    }
}
