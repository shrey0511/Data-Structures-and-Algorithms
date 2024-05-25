//https://leetcode.com/problems/sort-list/description/

import java.util.List;

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

    static ListNode sortList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode temp = head , slow = head , fast = head;
        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //At the end of this loop, temp is ending of firstHalf , slow is head of
        //secondHalf and fast is end of secondHalf

        temp.next = null;//breaks the list into 2 halves

        ListNode firstHalf = sortList(head);
        ListNode secondHalf = sortList(slow);

        return merge(firstHalf,secondHalf);
    }

    static ListNode merge(ListNode list1 , ListNode list2){

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = (list1 == null) ? list2 : list1;

        return dummyHead.next;
    }
}
