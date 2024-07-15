//https://leetcode.com/contest/weekly-contest-406/problems/delete-nodes-from-linked-list-present-in-array/

import java.util.HashSet;

public class code2 {

    //* Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        
        ListNode dummy = new ListNode();
        ListNode curr = head;
        dummy.next = head;

        ListNode prev = dummy;
        int i = 0 ;
        while(curr != null){
            if(set.contains(curr.val)){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
