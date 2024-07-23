//https://leetcode.com/problems/closest-nodes-queries-in-a-binary-search-tree/

import java.util.ArrayList;
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


    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> sorted = new ArrayList<>();
        inOrderTraversal(root , sorted);
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int query : queries){
            List<Integer> curr = new ArrayList<>();

            curr.add(findGreatestSmaller(sorted, query));
            curr.add(findSmallestGreater(sorted, query));
            
            ans.add(curr);
        }
        return ans;
    }

    private void inOrderTraversal(TreeNode node , List<Integer> sorted){
        if(node == null)
            return;

        inOrderTraversal(node.left , sorted);
        sorted.add(node.val);
        inOrderTraversal(node.right , sorted);
    }

    private int findGreatestSmaller(List<Integer> sorted ,int val ){
        int result = -1;
        int low = 0 , high = sorted.size()-1;
        

        while(low <= high){
            int mid = low + (high-low) / 2;

            if(sorted.get(mid) == val)
                return val;
            else if(sorted.get(mid) < val){
                result = sorted.get(mid);
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }

        return result;
        
    }
    private int findSmallestGreater(List<Integer> sorted ,int val){
        int result = -1;
        int low = 0 , high = sorted.size()-1;

        while(low <= high){
            int mid = low + (high-low) / 2;
            
            if(sorted.get(mid) == val)
                return val;
            else if(sorted.get(mid) > val){
                result = sorted.get(mid);
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }

        return result;
        
    }
}
