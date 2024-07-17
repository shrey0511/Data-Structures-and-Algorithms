//https://leetcode.com/problems/path-sum/

//Amazon question

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

    static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return helper(root,targetSum);
    }
    private static boolean helper(TreeNode node , int target){
        if(node == null){
            return false ; 
        }
        if(node.left == null && node.right == null)
            return target == node.val;

        boolean left = helper(node.left , target-node.val);
        boolean right = helper(node.right , target-node.val);

        return left || right;
    }

}
