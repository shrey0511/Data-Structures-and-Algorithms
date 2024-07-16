//https://leetcode.com/problems/diameter-of-binary-tree/

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

    //Googel , Amazon & Facebook question

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    //Post Order since we first take out left and right then we do the calc
    private int height(TreeNode node){
        if(node == null)
            return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        diameter = Math.max(diameter , leftHeight+rightHeight);

        return Math.max(leftHeight , rightHeight) + 1;
    }
}
