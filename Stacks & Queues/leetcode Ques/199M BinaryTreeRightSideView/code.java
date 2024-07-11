//https://leetcode.com/problems/binary-tree-right-side-view/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

    static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList();

        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            TreeNode rightMost = null;

            for(int i = 0 ; i<levelSize ; i++){
                TreeNode curr = q.poll();
                rightMost = curr;

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            ans.add(rightMost.val);
        }
        return ans;
    }

    ArrayList<Integer> value;
    public List<Integer> rightSideViewRec(TreeNode root) {
        value = new ArrayList<>();
        if(root == null){
            return value;
        }

        rightView(root,0);
        return value;
    }

    public void rightView(TreeNode node , int level){
        if(node == null){
            return;
        }

        if(value.size() == level){
            value.add(node.val);
        }

        rightView(node.right,level+1);
        rightView(node.left,level+1);
    }

}
