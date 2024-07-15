//https://leetcode.com/problems/cousins-in-binary-tree/

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

    static boolean isCousins(TreeNode root, int x, int y) {
        TreeNode left = findNode(root,x);
        TreeNode right = findNode(root,y);

        return (level(root,left,0) == level(root,right,0) && (!isSibling(root,left,right)));
    }

    static TreeNode findNode(TreeNode node , int val){
        if(node == null){
            return node;
        }
        if(node.val == val){
            return node;
        }

        TreeNode n = findNode(node.left , val);
        if(n != null){
            return n;
        }
        return findNode(node.right , val);
    }

    static boolean isSibling(TreeNode node,TreeNode left,TreeNode right){
        if(node == null){
            return false;
        }

        return (node.left == left && node.right == right || node.left == right && node.right == left || isSibling(node.left,left,right) || isSibling(node.right,left,right) );
    }

    static int level(TreeNode node , TreeNode x , int level){
        if(node == null)
            return 0;

        if(node == x){
            return level;
        }

        int l = level(node.left,x,level+1);
        if(l!=0){
            return l;
        }
        return (level(node.right,x,level+1));
    }

}
