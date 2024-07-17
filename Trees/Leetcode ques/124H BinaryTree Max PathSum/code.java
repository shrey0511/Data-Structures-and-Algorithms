//https://leetcode.com/problems/binary-tree-maximum-path-sum/

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

    private int max = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    private int helper(TreeNode node){
        if(node == null)
            return 0;

        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int currMax = left + right + node.val;

        //Check max with each node's path that we visit
        max = Math.max(currMax , max);

        return Math.max(left , right) + node.val;
    }

}
