//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;

        ListNode slow = head , fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next==null){
            head.next = null;
            return head;
        }
        slow.val = slow.next.val;
        slow.next = slow.next.next;

        return head;
    }
}
