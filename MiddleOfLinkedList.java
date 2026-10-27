class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleOfLinkedList {

    public static void main(String[] args) {

        // Creating linked list:
        // 1 -> 2 -> 3 -> 4 -> 5

        int[] values = {1, 2, 3, 4, 5};

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }


        ListNode middle = middleNode(head);

        System.out.println("Middle Node: " + middle.val);
    }


    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }
}