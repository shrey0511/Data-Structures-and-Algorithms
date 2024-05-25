//https://leetcode.com/problems/rotate-list/description/
//Asked in Facebook , Google and Twitter

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

    static ListNode rotateRight(ListNode head , int k){
        if(k<=1 || head == null || head.next == null)
            return head;

        int length = 1;
        ListNode last = head;
        while(last.next != null){
            last = last.next;
            length++;
        }
        last.next = head;

        int rotations = k % length;
        int skipNodes = length - rotations;

        ListNode newLast = head;
        for(int i=0; i<skipNodes-1 ; i++){
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
