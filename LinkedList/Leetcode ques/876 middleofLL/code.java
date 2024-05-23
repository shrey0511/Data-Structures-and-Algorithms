//https://leetcode.com/problems/middle-of-the-linked-list/description/

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

    static ListNode middleNode(ListNode head) {
        ListNode slow = head , fast = head;
        while( fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //This works because when someone is twice your speed then
        //by the time they reach the end, you are at the middle
        return slow;
    }
}
