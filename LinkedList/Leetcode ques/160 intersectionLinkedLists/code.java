//https://leetcode.com/problems/intersection-of-two-linked-lists/description/

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition of LinkedList
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    static ListNode getIntersectionNode(ListNode headA , ListNode headB){
        if(headA == null || headB == null) return null;

        ListNode a = headA , b = headB;
        while(a != b){
            a = (a==null) ? b : a.next;
            b = (b==null) ? a : b.next;
        }
        return a;
    }
}
