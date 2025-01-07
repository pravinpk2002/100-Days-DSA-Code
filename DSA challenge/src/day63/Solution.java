package day63;

import java.util.Stack;

public class Solution {

//234. Palindrome Linked List
    class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    //234. Palindrome Linked List
    public boolean isPalindrome(ListNode head) {

        Stack<Integer> stack  =  new Stack<>();

        ListNode temp = head;
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        while(head != null){
            if (head.val != stack.pop())
                return false;

            head = head.next;
        }

        return true;
    }


//19. Remove Nth Node From End of List




    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }


        if(length == n)
            return head.next;




        temp = head;

        for (int i = 1; i <= length - n -1; i++) {
            temp = temp.next;
        }

        temp = temp.next.next;

        return head;

    }


}
