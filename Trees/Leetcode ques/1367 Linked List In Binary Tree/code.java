//https://leetcode.com/problems/linked-list-in-binary-tree/

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

    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null) return false;
        ListNode curr = head;
        return helper(curr , root) || isSubPath(curr,root.left) || isSubPath(curr,root.right);
    }

    private boolean helper(ListNode curr , TreeNode node){
        if(curr == null){
            //Whole linkedList traversed
            return true;
        }

        if(node == null){
            return false;
        }

        if(node.val == curr.val){
            if(helper(curr.next , node.left) || helper(curr.next , node.right))
                return true;
        }

        return false;
        
    }
   
}
