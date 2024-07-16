//https://leetcode.com/problems/maximum-depth-of-binary-tree/

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

    //Google question
    
    static int maxDepth(TreeNode root) {
        return helper(root);
    }
    private static int helper(TreeNode node){
        if(node == null)
            return 0;

        int leftHeight = helper(node.left);//1
        int rightHeight = helper(node.right);//2

        return Math.max(leftHeight , rightHeight) + 1;
    }
}
