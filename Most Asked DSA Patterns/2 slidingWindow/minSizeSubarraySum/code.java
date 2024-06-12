//https://leetcode.com/problems/minimum-size-subarray-sum/description/

public class code {
    public static void main(String[] args) {
        
    }

    static int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 1) return (nums[0]>=target)? 1 : 0;
        
        int i = 0 , j = 0 , sum = 0;
        int minLength = Integer.MAX_VALUE;
        while(j < nums.length){
            sum += nums[j];
            while(sum >= target){
                sum -= nums[i];//From the start
                minLength = Math.min(j-i+1,minLength);
                i++;
            }
            j++;
        }
        if(minLength == Integer.MAX_VALUE)
            return 0;
        return minLength;
    }
}
