/**
 * linkedlist adding Element at end
 */
public class linkedlist {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = next;
        }

    }

    public void InsertFirst(int val) {
        ListNode newnode = new ListNode(val);
        newnode.next = head;
        head = newnode;
    }

    public void InsertEnd(int val) {
        ListNode newnode = new ListNode(val);
        if (head == null) {
            head = newnode;

        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = newnode;
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
        linkedlist li = new linkedlist();
        li.head = new ListNode(23);
        ListNode sec = new ListNode(12);
        ListNode third = new ListNode(1);

        li.head.next = sec;
        sec.next = third;
        third.next = null;
        li.InsertFirst(7);
        li.InsertEnd(12);
        li.InsertEnd(44);
        li.display();
    }
}