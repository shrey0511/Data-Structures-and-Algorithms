//https://leetcode.com/problems/reverse-linked-list/description/
//Google , Microsoft etc question

public class code {
    public static void main(String[] args) {
        
    }   
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //in-place reversal linked list
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
