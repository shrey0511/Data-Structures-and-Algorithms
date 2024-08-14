//https://leetcode.com/problems/partition-equal-subset-sum/

public class partitionEqualSubsetSum_416 {
    public static void main(String[] args) {
        
    }

    //Based on the subsetSum problem
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for(int num : nums)
            totalSum += num;

        if(totalSum % 2 != 0) return false;

        return subSetSumEqualK(nums , totalSum/2 , nums.length);        
    }
    public boolean subSetSumEqualK(int[] nums , int target , int n){
        boolean[][] dp = new boolean[n][target+1];

        for(int i = 0 ; i<n ; i++) dp[i][0] = true;

        if(nums[0] <= target) dp[0][nums[0]] = true;

        for(int i = 1 ; i<n ; i++){
            for(int sum = 1 ; sum<=target ; sum++){
                boolean notTaken = dp[i-1][sum];
                boolean taken = false;
                if(nums[i] <= sum){
                    taken = dp[i-1][sum-nums[i]];
                }
                dp[i][sum] = taken || notTaken;
            }
        }

        return dp[n-1][target];
    }
}
