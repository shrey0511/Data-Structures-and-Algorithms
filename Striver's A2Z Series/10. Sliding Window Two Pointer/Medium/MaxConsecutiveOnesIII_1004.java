//https://leetcode.com/problems/max-consecutive-ones-iii/

public class MaxConsecutiveOnesIII_1004 {
    public static void main(String[] args) {
        
    }

    public int longestOnes(int[] nums, int k) {
        int zeroes = 0 , left = 0 , right = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zeroes++;
            }
            right++;
            if(zeroes > k){
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }
        }
        return right-left;
    }
}
