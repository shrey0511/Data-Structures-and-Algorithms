//https://leetcode.com/problems/odd-even-linked-list/description/

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

    static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        ListNode odd = head;
        ListNode even = head.next;
        dummy.next = even;
        ListNode curr = head.next.next;

        int count = 3;
        while(curr != null){
            if(count%2 == 1){
                odd.next = curr;
                odd = odd.next;
            }else{
                even.next = curr;
                even = even.next;
            }
            count++;
            curr = curr.next;
        }
        even.next = null;
        odd.next = dummy.next;
        return head;
    }
}
