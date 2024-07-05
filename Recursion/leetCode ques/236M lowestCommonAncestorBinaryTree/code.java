//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

//AMEX GFG

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //Base case
        //If root goes null without finding or it does find p or q return that node
        if(root == null || root == p || root == q) return root;

        //Check both left and right subtrees for p and q
        TreeNode left = lowestCommonAncestor(root.left , p , q);
        TreeNode right = lowestCommonAncestor(root.right , p , q);
        
        //If both left and right are not null it means that p and q are in
        //separate subtrees therefore return current node
        if(left != null && right != null) return root;

        //If one of them is not null then the common part is in that side
        return left != null ? left : right;
    }
}
