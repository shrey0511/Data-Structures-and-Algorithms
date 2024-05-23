//https://leetcode.com/problems/sort-list/description/

public class sort {
    public static void main(String[] args) {
        
    }   
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode temp = head ; 
        ListNode slow = head ; 
        ListNode fast = head ;

        while(fast!=null && fast.next!=null){
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        //At the end of this loop,temp is end of first half
        //slow is head of second half and fast is end of second half

        temp.next = null;

        ListNode leftSide = sortList(head);
        ListNode rightSide = sortList(slow);

        return merge(leftSide,rightSide);
    }
    static ListNode merge(ListNode L , ListNode R){
        ListNode sortedTemp = new ListNode(0);
        ListNode curr = sortedTemp;

        while(L!=null && R!=null){
            if(L.val<R.val){
                curr.next = L;
                L = L.next;
            }else{
                curr.next = R;
                R = R.next;
            }
            curr = curr.next;
        }
        if(L!=null){
            curr.next = L;
        }
        if(R!=null){
            curr.next = R;
        }
        return sortedTemp.next;
    } 
}
