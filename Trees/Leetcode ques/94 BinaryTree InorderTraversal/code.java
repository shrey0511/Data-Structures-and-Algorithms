//https://leetcode.com/problems/binary-tree-inorder-traversal/

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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        while(root != null || !st.isEmpty()){

            while(root != null){
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            
            ans.add(root.val);
            
            root = root.right;
        }
        return ans;
    }


    public List<Integer> inorderTraversalRec(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        helper(root , ans);

        return ans;
    }
    public void helper(TreeNode node , List<Integer> ans){
        if(node == null){
            return;
        }

        helper(node.left , ans);

        ans.add(node.val);

        helper(node.right , ans);

        return;
    }
}
