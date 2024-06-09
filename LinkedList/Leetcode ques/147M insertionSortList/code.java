//https://leetcode.com/problems/insertion-sort-list/

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

    static ListNode insertionSortList(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head , prev = dummy;
        while(curr!=null){
            if(curr.next!=null && curr.next.val < curr.val){
                while(prev.next != null && prev.next.val < curr.next.val){
                    prev = prev.next;
                }
                ListNode temp = prev.next;
                prev.next = curr.next;
                curr.next = curr.next.next;
                prev.next.next = temp;
                prev = dummy;
            }else{
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
