//https://leetcode.com/problems/two-sum/description/

import java.util.HashMap;

public class code {
    public static void main(String[] args) {
        
    }
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int length = nums.length;

        for(int i = 0;i<length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{}; //No solution
    }
}
