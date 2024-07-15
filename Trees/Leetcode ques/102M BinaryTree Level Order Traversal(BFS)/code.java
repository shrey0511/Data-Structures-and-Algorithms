//https://leetcode.com/problems/binary-tree-level-order-traversal/

//BFS

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

    public List<List<Integer>> levelOrderQueue(TreeNode root) {
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
            ans.add(currList);
        }

        return ans;
    }

    public List<List<Integer>> levelOrderRec(TreeNode root) {
        return bfs(0,root,new ArrayList<>() );
    }
    private List<List<Integer>> bfs(int level , TreeNode node , List<List<Integer>> ans){
        if(node == null){
            return ans;
        }

        if(level + 1 <= ans.size()){
            //same level elements encoutered so add in the same list
            ans.get(level).add(node.val);
        }else{
            //Create a new temp list
            List<Integer> temp = new ArrayList<>();
            temp.add(node.val);
            ans.add(temp);
        }

        //Calls to left and right nodes
        ans = bfs(level+1 , node.left , ans);
        ans = bfs(level+1 , node.right , ans);

        return ans;
    }

    
}
