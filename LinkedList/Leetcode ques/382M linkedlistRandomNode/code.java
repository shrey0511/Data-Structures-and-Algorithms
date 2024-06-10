//https://leetcode.com/problems/linked-list-random-node/description/

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

    int N = 0;
    ListNode head = null;

    public code(ListNode head) {
        this.head = head;
        while(head !=null){
            this.N++;
            head = head.next;
        }
    }
    
    public int getRandom() {
        ListNode temp = this.head;//null
        int n = (int)(Math.random() * this.N);
        while(n>0){
            temp = temp.next;
            n--;
        }
        return temp.val;
    }
}
