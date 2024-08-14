//https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/

public class ParitionArrayIntoTwoArraysToMinimizeDifference_2035 {
    public static void main(String[] args) {
        
    }

    //Works only for positive values
    public int minimumDifference(int[] nums) {
        int n = nums.length ,totalSum = 0;
        for(int num : nums) totalSum += num;

        int k = totalSum;
        boolean[][] dp = new boolean[n][k+1];

        for(int i = 0 ; i<n ; i++) dp[i][0] = true;
        if(nums[0] <= k) dp[0][nums[0]] = true;

        for(int i = 1 ; i<n ; i++){
            for(int target = 1 ; target<=k ; target++){
                boolean notTaken = dp[i-1][target];
                boolean taken = false;
                if(nums[i] <= target){
                    taken = dp[i-1][target-nums[i]];
                }

                dp[i][target] = taken || notTaken;
            }
        }
        int mini = Integer.MAX_VALUE;
        for(int s1 = 0 ; s1 <= totalSum/2 ; s1++){
            if(dp[n-1][s1] == true){
                mini = Math.min(mini , Math.abs(s1 - (totalSum-s1)));
            }
        } 
        return mini;
    }
}
