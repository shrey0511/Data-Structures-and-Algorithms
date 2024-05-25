//https://leetcode.com/problems/reorder-list/description/
//Google and Facebook question

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

    static void reorderList(ListNode head){
        if(head == null || head.next == null) return;

        ListNode s = reverse(middleNode(head));
        ListNode f = head;
        while(f!=null && s!=null){
            ListNode temp = f.next;
            f.next = s;
            f = temp;

            temp = s.next;
            s.next = f;
            s = temp;
        }
        if(f!=null){
            f.next = null;
        }
        return;
    }
    static ListNode middleNode(ListNode head){
        ListNode slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static ListNode reverse(ListNode head){
        if(head == null) return head;
        ListNode prev = null , pres = head , next = pres.next;
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
        return head;
    }
}
