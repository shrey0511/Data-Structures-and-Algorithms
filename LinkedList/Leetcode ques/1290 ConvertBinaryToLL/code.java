//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/

public class code {
    public static void main(String[] args) {
        
    }    
    // * Definition for singly-linked list.
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    static int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int ans = 0;
        while(temp!=null){
            ans = (ans<<1)+temp.val;
            temp = temp.next;
        }
        return ans;
    }
   
}
