//https://leetcode.com/problems/find-mode-in-binary-search-tree/

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }



    public int[] findMode(TreeNode root) {
        //To store node val and its count
        HashMap<Integer,Integer> map = new HashMap<>();
        helper(root , map);
        int max = 0;

        for(int count : map.values()){
            if(count > max)
                max = count;
        }

        ArrayList<Integer> modes = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                modes.add(entry.getKey());
            }
        }

        int[] ans = new int[modes.size()];
        for(int i = 0 ; i<modes.size() ; i++){
            ans[i] = modes.get(i);
        }

        return ans;
    }

    private void helper(TreeNode node , HashMap<Integer,Integer> map){
        if(node == null)
            return;

        map.put(node.val , map.getOrDefault(node.val , 0)+1);

        helper(node.left , map);
        helper(node.right , map);

        return;
    }
}
