//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
//Asked in Amex

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

    static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = head , prev = dummyHead;
        while(temp!= null && temp.next != null){
            if(temp.val == temp.next.val){
                int val = temp.val;
                while(temp!= null && temp.val == val)
                    temp = temp.next;
                prev.next = temp;
            }else{
                prev = temp;
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }
    
}
