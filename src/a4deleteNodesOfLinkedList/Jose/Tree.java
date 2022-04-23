package a4deleteNodesOfLinkedList.Jose;

public class Tree {

    Node head;

    public Tree() {
        this.head = null;
    }

    public Node insertAtTheEnd(int value){
        Node newNode = new Node();
        newNode.value = value;

        if (head==null) {
            head = newNode;
            newNode.next = null;
            return newNode;
        }

        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next =newNode;

        return newNode;
    }

    public void print(){

        if (head==null) {
            System.out.println("null");
            return;
        }

        Node current = head;
        System.out.println("Nodes are (from header): ");

        while(current!=null){
            System.out.print(current.value+" -> ");
            current = current.next;
        }
        // Print null after last node
        System.out.println("null");
    }

    public void keepMRemoveN(int m, int n){

        if (head==null) {
            return;
        }

        Node current = head;
        Node beforeRemove = head;
        Node afterRemove;
        int counterToKeep = 0;
        int counterToRemove = 0;
        boolean keepEndFound = false;
        while(current!=null){

            // Start the keep counter
            counterToKeep++;
            // Start the remove counter
            if (keepEndFound) {
                counterToRemove++;

                if (counterToRemove==n+1) {
                    afterRemove=current;
                    beforeRemove.next =afterRemove;
                    counterToKeep=1;
                    counterToRemove=0;
                    keepEndFound=false;
                }

                if (current.next ==null){
                    beforeRemove.next =null;
                }
            }

            if (counterToKeep==m) {
                beforeRemove=current;
                keepEndFound=true;
            }

            current = current.next;
        }

    }

    public void keepMRemoveN_2(int m, int n){

        if (head==null) {
            return;
        }

        Node current = head;
        Node preCurrent = head;

        while(current!=null){

            for (int i = 0; i < m && current!=null; i++) {
                preCurrent = current;
                current = current.next;
            }

            for (int i = 0; i < n && current!=null; i++) {
                current = current.next;
            }

            if (preCurrent!=current){
                preCurrent.next=current;
            }

        }

    }




}
