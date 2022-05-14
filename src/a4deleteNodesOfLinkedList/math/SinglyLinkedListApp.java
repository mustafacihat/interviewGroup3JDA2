package a4deleteNodesOfLinkedList.math;

import java.util.Scanner;

public class SinglyLinkedListApp {
    public static void main(String[] args) {

        MySinglyLinkedList<Integer> nums = new MySinglyLinkedList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("please enter length of LinkedList");
        int length = input.nextInt();
        for (int i = 0; i < length; i++) {
            //System.out.printf("Enter %d.  value please = ", i);
            //nums.myAdd(input.next());
            //input.close();
            nums.myAdd(i);
        }
        System.out.println("Before removing");
        nums.myPrintNodes();
        nums.stayMeRemoveN(nums.head, 3, 2);
        System.out.println("After Removing");
        nums.myPrintNodes();
    }
}
