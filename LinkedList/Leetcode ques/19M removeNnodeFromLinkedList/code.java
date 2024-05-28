//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

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

    //Single pass
    public  ListNode removeNthFromEnd(ListNode head , int n){
        ListNode slow = head , fast = head;
        for(int i=0 ; i<n ; i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    //Using reversal
    // class Solution {
    //     public ListNode removeNthFromEnd(ListNode head, int n) {
    //         if(head == null || head.next == null) return null;
    //         ListNode dummyHead = new ListNode(0);
    //         ListNode temp = reverse(head);
    //         dummyHead.next = temp;
    //         if(n == 1){
    //             temp = temp.next;
    //             dummyHead.next = temp;
    //         }
    
    //         int count = 1;
    //         while(temp!=null){
    //             if(count == n-1){
    //                 temp.next = temp.next.next;
    //             }
    //             count++;
    //             temp = temp.next;
    //         }
    //         return reverse(dummyHead.next);
    //     }
    
    //     public ListNode reverse(ListNode node){
    //         if(node == null) return node;
    
    //         ListNode prev = null , pres = node , next = pres.next;
    //         while(pres != null){
    //             pres.next = prev;
    //             prev = pres;
    //             pres = next;
    //             if(next!=null){
    //                 next = next.next;
    //             } 
    //         }
    //         node = prev;
    //         return node;
    //     }
    // }
}
