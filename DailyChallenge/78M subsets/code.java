//https://leetcode.com/problems/subsets/?envType=daily-question&envId=2024-05-21

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans , new ArrayList<Integer>() , nums , 0);
        return ans;
    }
    static void backtrack(List<List<Integer>> ans , List<Integer> tempset , int[] nums , int start){
        ans.add(new ArrayList<>(tempset));
        for(int i = start ; i<nums.length ; i++){
            tempset.add(nums[i]);

            backtrack(ans, tempset, nums, i+1);

            tempset.remove(tempset.size()-1);
        }
    }
}
