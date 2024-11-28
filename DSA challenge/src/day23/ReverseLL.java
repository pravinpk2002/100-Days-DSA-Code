package day23;

import day22.DoublyLL;

public class ReverseLL extends DoublyLL {

    //This is only solution of GFG problem
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if (head == null || head.next == null) {
            return head;
        }

        DLLNode current = head;
        DLLNode temp = null;

        while (current != null) {

            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}
