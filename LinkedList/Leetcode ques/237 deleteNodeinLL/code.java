//https://leetcode.com/problems/delete-node-in-a-linked-list/description/

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
