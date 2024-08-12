//https://leetcode.com/problems/house-robber/

import java.util.Arrays;

public class houseRobber_198 {
    public static void main(String[] args) {
        
    }

    //Optimized
    public int rob(int[] nums){
        int ans = 0;
        int prev = nums[0];
        int prev2 = Integer.MIN_VALUE;

        for(int i = 1 ; i<nums.length ; i++){
            int taken = nums[i];
            if(i>1) taken += prev2;
            int notTake = prev;

            ans = Math.max(taken , notTake);
            prev2 = prev;
            prev = ans;
        }
        return prev;
    }

    //Tabulation
    public int robTab(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1 ; i<nums.length ; i++){
            int take = nums[i];
            if(i>1) take += dp[i-2];
            int notTaken = dp[i-1];

            dp[i] = Math.max(take , notTaken); 
        }
        return dp[nums.length-1];
    }

    //Recursion with memoization
    public int robRec(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,dp,0);
    }

    public int helper(int[] nums,int[] dp,int i) {
        if(i >= nums.length)
            return 0;

        if(dp[i] != -1){
            return dp[i];
        }

        int taken = nums[i] + helper(nums , dp , i+2 );
        int notTaken = 0 + helper(nums , dp , i+1 );

        return dp[i] = Math.max(taken,notTaken); 
    }

    //
}
