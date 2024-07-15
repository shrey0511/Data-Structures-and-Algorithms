//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

//Google , Amazon & Microsoft

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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

    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans =  new ArrayList<>();
        Deque<TreeNode> dq = new ArrayDeque();

        if(root == null)
            return ans;

        dq.add(root);
        boolean rev = false;

        while(!dq.isEmpty()){
            int levelSize = dq.size();
            List<Integer> currList = new ArrayList<>(levelSize);

            for(int i = 0 ; i<levelSize ; i++){
                TreeNode popped;
                if(rev){
                    //Remove from back of queue
                    //Insert in the start
                    popped = dq.removeLast();
                    if(popped.right != null){
                        dq.addFirst(popped.right);
                    }
                    if(popped.left != null){
                        dq.addFirst(popped.left);
                    }
                    //In this case we added the right element first because
                    //when we add first then the order changes of left and right

                }else{
                    //Just normally remove from front
                    //Insert new from end
                    popped = dq.removeFirst();
                    if(popped.left != null){
                        dq.addLast(popped.left);
                    }
                    if(popped.right != null){
                        dq.addLast(popped.right);
                    }   
                }
                currList.add(popped.val);
            }
            rev = !rev;
            ans.add(currList);
        }
        return ans;
    }
}
