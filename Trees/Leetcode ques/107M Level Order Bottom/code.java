//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

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

    static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList();

        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size(); //These many times we will add nodes

            List<Integer> currList = new ArrayList<>(levelSize);

            for(int i = 0 ; i<levelSize ; i++){    
                TreeNode popped = q.poll();
                currList.add(popped.val);

                if(popped.left != null)
                    q.add(popped.left);
                if(popped.right != null)
                    q.add(popped.right);
            }
            ans.add(0,currList);//Pura list ko uthake ans ke aage lgadia
        }

        return ans;
    }

}
