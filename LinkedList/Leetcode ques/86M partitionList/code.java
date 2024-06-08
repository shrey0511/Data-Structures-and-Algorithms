//https://leetcode.com/problems/partition-list/

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

    static ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode curr1 = before;
        ListNode curr2 = after;

        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                curr1.next = temp;
                curr1 = curr1.next;
            }else{
                curr2.next = temp;
                curr2 = curr2.next;
            }
            temp = temp.next;
        }
        curr1.next = after.next;
        curr2.next = null;

        return before.next;
    }
}
