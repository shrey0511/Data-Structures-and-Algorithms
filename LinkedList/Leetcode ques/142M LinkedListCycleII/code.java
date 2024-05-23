//https://leetcode.com/problems/linked-list-cycle-ii/description/

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

    public int lengthCycle(ListNode head){
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

    public ListNode detectCycleStart(ListNode head){
        //First find the cycle and its length
        int length = 0;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                //Cycle found now find its length
                length = lengthCycle(head);
                break;
            }
        }

        if(length == 0)
            return null;

        //Find the start node
        ListNode s = head;
        ListNode f = head;

        //We take s and move it length times
        while (length>0) {
            s = s.next;
            length--;
        }

        //Now when we move both, they meet at the starting point of the cycle
        while(s != f){
            s = s.next;
            f = f.next;
        }
        return s;
    } 
}
