//https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = head , fast = head.next, prev = dummy;
        while(fast != null){
            slow.next = fast.next;
            fast.next = slow;
            prev.next = fast;
            prev = slow;
            slow = slow.next;
            if(slow != null){
                fast = slow.next;
            }else{
                break;
            }
        }
        return dummy.next;
    }


//Or we can use recursion
// public class Solution{
//     public ListNode swapPairs(ListNode head){
//         if(head == null)||(head.next == null)
//             return head;
//         ListNode n = head.next;
//         head.next = swapPairs(head.next.next);
//         n.next = head;
//         return n;
//     }
// } 

}
