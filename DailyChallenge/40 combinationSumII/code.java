//https://leetcode.com/problems/combination-sum-ii/?envType=daily-question&envId=2024-08-13

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(ans , new ArrayList<>() , candidates , target , 0);

        return ans;        
    }

    public void helper(List<List<Integer>> ans , List<Integer> list , int[] candidates ,int remain , int ind){
        if(remain == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        else if(remain < 0) return;
        else{
            for(int i = ind ; i<candidates.length ; i++){
                if(i>ind && candidates[i] == candidates[i-1]) continue;
                list.add(candidates[i]);
                helper(ans,list,candidates,remain-candidates[i],i+1);
                list.remove(list.size()-1);
            }
        }
        return;
    }
}
