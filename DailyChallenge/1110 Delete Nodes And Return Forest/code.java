//https://leetcode.com/problems/delete-nodes-and-return-forest/?envType=daily-question&envId=2024-07-17

import java.util.*;

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

    static List<TreeNode> delNodes(TreeNode root , int[] to_delete){
        List<TreeNode> ans = new ArrayList<>();
        //To store the to delete nodes and access them efficiently
        HashSet<Integer> delete = new HashSet<>();

        for(int num : to_delete){
            delete.add(num);
        }

        helper(root,delete,ans,true);

        return ans;

    }

    private static TreeNode helper(TreeNode node, HashSet<Integer> delete, List<TreeNode> ans, boolean isRoot) {
        if(node == null)
            return null;

        boolean toDelete = delete.contains(node.val);

        if(isRoot && !toDelete){
            ans.add(node);
        }

        node.left = helper(node.left, delete, ans, isRoot);
        node.right = helper(node.right, delete, ans, isRoot);

        return toDelete ? null : node;
    }
}
