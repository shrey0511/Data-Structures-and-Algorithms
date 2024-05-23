//https://leetcode.com/problems/linked-list-cycle/description/

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //Asked in Amazon and Microsoft
    static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

    static int lengthCycle(ListNode head){
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){//If they meet then there is a cycle
                //calculate the length
                do{
                    ++length;
                    slow = slow.next;
                } while (slow != fast);
                return length;
            }
        }
        return 0;
    }
}
