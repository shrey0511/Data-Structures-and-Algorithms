//https://leetcode.com/problems/binary-tree-preorder-traversal/

import java.util.ArrayList;
import java.util.List;

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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }

    private void helper(TreeNode node , List<Integer> ans){
        if(node == null)
            return;

        ans.add(node.val);
        helper(node.left , ans);
        helper(node.right,ans);

        return;
    }
}

