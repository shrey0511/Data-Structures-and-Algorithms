//https://leetcode.com/problems/merge-two-sorted-lists/description/

public class code {
    public static void main(String[] args) {
        
    }

    // * Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummyHead = new ListNode();
        ListNode ans = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ans.next = list1;
                list1 = list1.next;  
                ans = ans.next;               
            }else{
                ans.next = list2;
                list2 = list2.next;
                ans = ans.next;
            }
        }
        ans.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
    
}
