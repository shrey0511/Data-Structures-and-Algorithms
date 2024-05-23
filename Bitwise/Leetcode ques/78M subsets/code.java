//https://leetcode.com/problems/subsets/description/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    static void backtrack(List<List<Integer>> ans , List<Integer> tempset , int[] nums , int start){
        ans.add(new ArrayList<>(tempset));
        for(int i=start ; i<nums.length;i++){
            tempset.add(nums[i]);//With the number
            backtrack(ans, tempset, nums, i+1);//Call the function everytime for each new set after the current element
            tempset.remove(tempset.size()-1);//Without the number
        }
    }

    //For all kinds of combination solutions(subsets, PnC)
    //https://leetcode.com/problems/subsets/solutions/27281/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning
}
