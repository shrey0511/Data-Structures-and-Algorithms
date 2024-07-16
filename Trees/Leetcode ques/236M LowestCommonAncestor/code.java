//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

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

    static TreeNode lowestCommonAncestor(TreeNode root , TreeNode p , TreeNode q){
        if(root == null || root == p || root == q){
            return root;
        }//Root found

        //If not found then go left and right
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //If both of them are not null then we found our node
        if(left != null && right != null){
            return root;
        }

        //if one of them are not null then the second answer is also in that
        return (left != null) ? left : right;
    }
}
