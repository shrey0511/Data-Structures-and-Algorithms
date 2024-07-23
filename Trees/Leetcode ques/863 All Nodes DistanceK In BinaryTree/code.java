//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }   
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        List<Integer> ans = new ArrayList<>();
        findDistance(root ,target, k , ans);
        return ans;

    }

    private int findDistance(TreeNode node , TreeNode target , int k , List<Integer> ans){
        if(node == null)
            return -1;

        if(node == target){
            addSubtreeNodes(node , k , ans);
            return 0;
        }

        int leftDistance = findDistance(node.left , target ,k , ans);
        if(leftDistance != -1){
            if(leftDistance + 1 == k){
                ans.add(node.val);
            }else{
                addSubtreeNodes(node.right , k - leftDistance - 2 , ans);
            }
            return leftDistance + 1;
        }

        int rightDistance = findDistance(node.right , target ,k , ans);
        if(rightDistance != -1){
            if(rightDistance + 1 == k){
                ans.add(node.val);
            }else{
                addSubtreeNodes(node.left , k - rightDistance - 2 , ans);
            }
            return rightDistance + 1;
        }
        return -1;
    }

    private void addSubtreeNodes(TreeNode node , int k , List<Integer> ans){
        if(node == null || k < 0){
            return;
        }

        if(k == 0)
            ans.add(node.val);

        addSubtreeNodes(node.left , k-1 , ans);
        addSubtreeNodes(node.right , k-1 , ans);

        return;
    }
}
