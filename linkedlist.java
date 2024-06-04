
// singly LinkedList Insertion of Element at beginning
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

    public int display() {
        ListNode curr = head;
        // number of element in an LinkedList
        int count = 0;
        System.out.print(" Elements of singly LinkedList :");
        while (curr != null) {
            System.out.print(" " + curr.data + "-->");
            curr = curr.next;
            count++;

        }
        System.out.println("null");
        return count;
    }

    public void InsertFirst(int val) {
        ListNode newnode = new ListNode(val);
        newnode.next = head;
        head = newnode;
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

        l.InsertFirst(22);
        l.InsertFirst(23);
        int data = l.display();
        System.out.println("Length of a LinkedList :" + data);

    }

}
