//https://www.geeksforgeeks.org/level-order-successor-of-a-node-in-binary-tree/

//Google question

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

    static TreeNode levelOrderSuccessor(TreeNode node , int value){

        if(node == null){
            return null;
        }

        Queue<TreeNode> q = new LinkedList();

        q.add(node);

        while(!q.isEmpty()){
            TreeNode popped = q.poll();

            if(popped.left != null){
                q.add(popped.left);
            }
            if(popped.right != null){
                q.add(popped.right);
            }
            if(popped.val == value){
                break;
            }
        }
        return q.peek();
    }
}

//Time and Space complexity : O(N)
