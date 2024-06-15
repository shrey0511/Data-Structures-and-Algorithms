//https://leetcode.com/problems/minimum-increment-to-make-array-unique/description/

import java.util.Arrays;


public class code {
    public static void main(String[] args) {
        
    }

    static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int increment = 0 , moves = 0;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i]<=nums[i-1]){
                increment = nums[i-1] - nums[i] + 1;
                nums[i] += increment;
                moves += increment;
            }
        }
        return moves;
    }
}
