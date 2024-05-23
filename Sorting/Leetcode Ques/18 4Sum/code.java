//https://leetcode.com/problems/4sum/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length < 4) return res;
        for(int i = 0; i < nums.length - 3; i++) {   
            if(i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0 && nums[i] > target ) return res;
            for(int j = i+1; j< nums.length-2; j++) {
                
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int left = j + 1, right = nums.length-1;
                while(left<right) {
                    int curSum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(curSum > target) {
                        right--;
                    } else if (curSum < target) {
                        left++;
                    } else {
                        res.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[left], nums[right]}));
                        while(left<right && nums[right] == nums[right-1]) right--;
                        while(left<right && nums[left] == nums[left+1]) left++;
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
