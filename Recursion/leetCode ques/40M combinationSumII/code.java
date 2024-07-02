//https://leetcode.com/problems/combination-sum-ii/

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res , new ArrayList<>() , candidates , target , 0);
        return res;
    }

    private static void helper(List<List<Integer>> res, ArrayList<Integer> list, int[] nums, int remain, int index) {

        if(remain == 0){
            res.add(list);
            return;
        }else if(remain < 0){
            return;
        }else{
            for(int i = index ; i<nums.length ; i++){
                if( i > index && nums[i] == nums[i-1])
                    continue;

                list.add(nums[i]);
                helper(res, list, nums, remain-nums[i], index+1);
                list.remove(list.size()-1);
            }
        }
    }
}
