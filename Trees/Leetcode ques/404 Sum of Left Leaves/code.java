//https://leetcode.com/problems/sum-of-left-leaves/

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

    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left == null && root.right == null)
            return 0;
        return helper(root,false);
    }

    private int helper(TreeNode node ,boolean isLeft){
        if(node == null)
            return 0;
        
        if(isLeft && node.left == null && node.right == null)
            return node.val;

        int left = helper(node.left ,true);
        int right = helper(node.right ,false);

        return left+right;
    }
}
