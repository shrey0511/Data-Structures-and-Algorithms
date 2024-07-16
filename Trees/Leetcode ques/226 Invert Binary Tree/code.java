//https://leetcode.com/problems/invert-binary-tree/

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static TreeNode invertTree(TreeNode root) {
        return helper(root);
    }
    private static TreeNode helper(TreeNode node){
        if(node == null)
            return node;
        
        //Before we swap the left & right of the current node
        //We need to go down and swap all the subtrees first
        TreeNode left = helper(node.left);
        TreeNode right = helper(node.right);

        //After subtree calls are back , now we can swap this one
        node.left = right;
        node.right = left;

        return node;
    }

    //Time complexity : O(N)  Space complexity : O(h) or O(logN) 
}
