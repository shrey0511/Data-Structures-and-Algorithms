//https://leetcode.com/problems/reverse-nodes-in-k-group/description/
//Asked in Google , Microsoft , Facebook , Amazon

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

    static ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head == null)
            return head;
        
        ListNode present = head;
        ListNode prev = null;

        int remainingLength = listLength(head);

        while(remainingLength >= k){
            ListNode last = prev;
            ListNode newEnd = present;

            ListNode next = present.next;
            for(int i=0;present!=null && i<k;i++){
                present.next = prev;
                prev = present;
                present = next;
                if(next!=null)
                    next = next.next; 
            }
            if(last!=null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = present;
            prev = newEnd;

            remainingLength = remainingLength - k;
        }
        return head;
    }

    static int listLength(ListNode head){
        if(head == null) return 0;

        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length += 1;
            temp=temp.next;
        }
        return length;
    }

    static ListNode reverseKAlternateGroup(ListNode head, int k) {
        if(k<=1 || head == null)
            return head;
        
        ListNode present = head;
        ListNode prev = null;

        int remainingLength = listLength(head);

        while(remainingLength >= k){
            ListNode last = prev;
            ListNode newEnd = present;

            ListNode next = present.next;
            for(int i=0 ; present!=null && i<k ; i++){
                present.next = prev;
                prev = present;
                present = next;
                if(next!=null)
                    next = next.next; 
            }
            if(last!=null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = present;

            //Skip the k nodes after each reverse
            for(int i=0 ; present!=null && i<k;i++){
                prev = present;
                present = present.next;
            }

            remainingLength = remainingLength - k;
        }
        return head;
    }
}
