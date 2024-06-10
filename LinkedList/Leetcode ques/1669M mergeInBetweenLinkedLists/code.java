//https://leetcode.com/problems/merge-in-between-linked-lists/

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
    

    static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        int index = 0;
        while(index<a-1){
            curr = curr.next;
            index++;
        }
        ListNode front = curr;
        while(index<b+1){
            curr = curr.next;
            index++;
        }
        ListNode rear = curr;
        ListNode secondListHead = list2 , secondListTail = list2;
        while(secondListTail.next != null){
            secondListTail = secondListTail.next;
        }
        front.next = secondListHead;
        secondListTail.next = rear;
        
        return list1;
    }
}
