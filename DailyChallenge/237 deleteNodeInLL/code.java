//https://leetcode.com/problems/delete-node-in-a-linked-list/description/?envType=daily-question&envId=2024-05-05

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
