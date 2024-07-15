//https://leetcode.com/problems/average-of-levels-in-binary-tree/

//Asked in google

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

    static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList();

        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size();//These many times we will pop and calc
            double sum = 0.0;

            for(int i = 0 ; i<levelSize ; i++){
                TreeNode popped = q.poll();
                sum += popped.val;

                if(popped.left != null){
                    q.add(popped.left);
                }
                if(popped.right != null){
                    q.add(popped.right);
                }
            }
            ans.add(sum/levelSize);
        }
        return ans;
    }

}
