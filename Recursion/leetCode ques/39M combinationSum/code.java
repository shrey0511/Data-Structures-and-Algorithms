//https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    static void helper(List<List<Integer>> res , List<Integer> temp , int[] nums , int remain , int index){
        if(remain == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        else if(remain < 0)
            return;
        else{
            for(int i = index ; i < nums.length ; i++){
                temp.add(nums[i]);
                helper(res,temp,nums,remain - nums[i] , i);
                temp.remove(temp.size()-1);
            }
        }
    }
}
