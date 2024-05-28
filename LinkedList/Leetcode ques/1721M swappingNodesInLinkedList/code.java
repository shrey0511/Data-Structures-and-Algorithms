//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

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

    static ListNode swapNodes(ListNode head, int k) {
        ListNode t1 = head , t2 = new ListNode(0,head);
        for(int i=1;i<k;i++){
            t1 = t1.next;
        }
        ListNode temp = t1;
        while(temp!=null){
            temp = temp.next;
            t2 = t2.next;
        }
        int temp2 = t1.val;
        t1.val = t2.val;
        t2.val = temp2;

        return head;
    }
}
