//https://leetcode.com/problems/split-linked-list-in-parts/description/

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

    static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] parts = new ListNode[k];
        int length = 0;
        ListNode temp = head;
        while (temp!=null) {
            length++;
            temp = temp.next;
        }
        int minSize = length/k;
        int r = length%k;

        ListNode prev = null;
        temp = head;

        for(int i = 0 ; i<k ; i++,r--){//For k parts
            parts[i] = temp;

            for(int j=0 ; j<(minSize + (r>0?1:0)) ; j++){//For inserting in each part
                prev = temp;
                temp = temp.next;
            }
            if(prev!=null)
                prev.next = null;
        }
        return parts;

    }
}
