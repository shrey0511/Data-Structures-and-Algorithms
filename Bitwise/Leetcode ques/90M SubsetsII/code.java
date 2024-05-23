//https://leetcode.com/problems/subsets-ii/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code {
  public static void main(String[] args) {
    
  } 
  static List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(ans , new ArrayList<>() , nums , 0);
    return ans;
}
    static void backtrack(List<List<Integer>> ans , List<Integer> tempset , int[] nums , int start){
        ans.add(new ArrayList<>(tempset));
        for(int i=start ; i<nums.length;i++){
            if(i!=start&&nums[i]==nums[i-1])
                continue;
            tempset.add(nums[i]);
            backtrack(ans , tempset , nums , i+1);
            tempset.remove(tempset.size()-1);
        } 
    }
}
