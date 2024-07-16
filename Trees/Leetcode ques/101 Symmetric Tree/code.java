//https://leetcode.com/problems/symmetric-tree/

import java.util.LinkedList;
import java.util.Queue;

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

    static boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;

        return isMirror(root.left , root.right);
    }
    private static boolean isMirror(TreeNode left , TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && isMirror(left.left , right.right) && isMirror(left.right , right.left);
    }

    public boolean isSymmetricQueue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();

        q.add(root.left);
        q.add(root.right);

        while(!q.isEmpty()){
            TreeNode left = q.poll();
            TreeNode right = q.poll();

            if(left == null && right == null){
                continue;
            }
            if(left == null || right == null){
                return false;
            }
            if(left.val != right.val)
                return false;

            //this Order matters because we need to check w.r.t mirror
            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }
        return true;
    }

    // Time & Space complexity : O(N)

}
