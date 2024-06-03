//https://leetcode.com/problems/add-two-numbers/description/
//TCS Amazon Microsoft Facebook Qualcomm ques

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

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode tail = temp;
        int sum = 0 , carry = 0;
        if(l1 == null && l2 == null ) return null;
        while(l1 != null || l2 != null || carry != 0){
            int digit1 = (l1 != null)? l1.val : 0;
            int digit2 = (l2 != null)? l2.val : 0;  

            sum = digit1 + digit2 + carry;
            int digit = (sum % 10);         
            carry = sum/10;

            ListNode node = new ListNode(digit);
            tail.next = node;
            tail = tail.next; 

            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null)? l2.next : null;
        }
        return temp.next;
    }
}
