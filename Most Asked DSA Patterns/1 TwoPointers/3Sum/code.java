//https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        if(nums.length <=2) return ans;
        for(int i = 0 ; i<nums.length - 2 ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1  , k = nums.length - 1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ans.add(Arrays.asList(new Integer[]{nums[i],nums[j],nums[k]} ));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;//To avoid duplicates
                    while(j<k && nums[k] == nums[k+1]) k--; 
                }
            }
        }
        return ans;
    }
}
