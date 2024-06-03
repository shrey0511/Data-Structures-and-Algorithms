//https://leetcode.com/problems/add-two-numbers-ii/description/

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        ListNode temp1 = reverseList(l1);
        ListNode temp2 = reverseList(l2);
        int carry = 0 , sum = 0;

        while(temp1 != null || temp2 != null || carry != 0){
            int digit1 = (temp1 != null)? temp1.val : 0;
            int digit2 = (temp2 != null)? temp2.val : 0;
        
            sum = digit1 + digit2 + carry;
            int digit = sum%10;
            carry = sum/10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            temp1 = (temp1 != null)? temp1.next : null;
            temp2 = (temp2 != null)? temp2.next : null;
        }
        return reverseList(dummyHead.next);
    }

    static ListNode reverseList(ListNode head) {
        if(head == null) return head;

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null)
                next = next.next;
        }
        head = prev;
        return head;
    }
}
