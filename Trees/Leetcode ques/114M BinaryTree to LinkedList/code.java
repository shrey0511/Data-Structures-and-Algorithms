//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

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

    //Draw the tree to understand
    //Facebook question

    static void flatten(TreeNode root) {
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode temp = curr.left;
                while(temp.right != null){
                    temp = temp.right;//Finding right most element
                }
                //Since all value in right are greater in BST
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    //This one takes O(N) time and space
    static Queue<TreeNode> q = new LinkedList();
    public static void flattenQueue(TreeNode root){
        if(root == null)
            return;

        preOrder(root);

        TreeNode curr = q.poll();

        while(!q.isEmpty()){
            curr.left = null;
            curr.right = q.poll();

            curr = curr.right;
        }
        curr.right = null;
    }
    private static void preOrder(TreeNode node){
        if(node == null){
            return;
        }

        q.add(node);
        preOrder(node.left);
        preOrder(node.right);
    }

}
