
// singly LinkedList
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

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.head = new ListNode(10);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(12);
        ListNode forth = new ListNode(4);
        l.head.next = sec;
        sec.next = third;
        third.next = forth;
        forth.next = null;
    }

}
