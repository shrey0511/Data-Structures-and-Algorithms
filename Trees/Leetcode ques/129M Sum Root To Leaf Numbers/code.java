//https://leetcode.com/problems/sum-root-to-leaf-numbers/

//Google Microsoft
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

    public int sumNumbers(TreeNode root) {
        return helper(root , 0);
    }
    private int helper(TreeNode node , int num){
        if(node == null){
            return 0;
        }

        num = num*10 + node.val;

        if(node.left == null && node.right == null){
            return num;
        }

        int left = helper(node.left , num);
        int right = helper(node.right , num);

        return left + right;
    }

    //Time & Space Complexity : O(N)
}
