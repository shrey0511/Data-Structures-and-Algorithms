//https://leetcode.com/problems/palindrome-linked-list/
//Asked in Google , Microsoft , LinkedIn , Amazon & Apple

public class code {
    public static void main(String[] args) {
        ListNode LL = new ListNode(5,null);
        ListNode LL1 = new ListNode(2, LL);
        ListNode LL2 = new ListNode(2,LL1);
        ListNode LL3 = new ListNode(5, LL2);

        System.out.println(isPalindrome(LL3));
    }

    //* Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);

        ListNode secondHead = reverseLL(mid);
        ListNode reReverseHead = secondHead;

        //Compare both the halves
        while(head != null && secondHead != null){
            if(head.val != secondHead.val)
                break;
            
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseLL(reReverseHead);

        return head == null || secondHead == null;
    }

    static ListNode middleNode(ListNode head){
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode reverseLL(ListNode head){
        ListNode prev = null , pres = head , next = pres.next;
        while (pres!=null){
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
