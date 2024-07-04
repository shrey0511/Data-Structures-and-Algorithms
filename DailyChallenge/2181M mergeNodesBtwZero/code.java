//https://leetcode.com/problems/merge-nodes-in-between-zeros/?envType=daily-question&envId=2024-07-04

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

    //More clear
    static ListNode mergeNodes1(ListNode head){
        ListNode left = head.next;
        ListNode right = left;

        while(right != null){
            int sum = 0;

            while(right.val != 0){
                sum += right.val;
                right = right.next;
            }
            left.val = sum;

            //Moving the right to the next non-zero node
            right = right.next;

            left.next = right;
            left = left.next;
        }
        return head.next;
    }


    //First attempt
    static ListNode mergeNodes(ListNode head) {
        ListNode left = head , right = head ;
        while(right.next != null){    
            while(right.next.val != 0){
                right = right.next;
                left.val += right.val;
            }
            if(right.next.next == null){
                left.next = null;
                right.next = null;
            }else{
                right = right.next;
                left.next = right;
                left = left.next;
            }
        }
        return head;
    }
}
