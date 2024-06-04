
// singly LinkedList Printing Element
import java.util.LinkedList;

public class linkedlist {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void display() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data + "-->");
            curr = curr.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.head = new ListNode(10);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(12);
        ListNode forth = new ListNode(4);
        ListNode fifth = new ListNode(7);
        l.head.next = sec;
        sec.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = null;
        l.display();
    }

}
