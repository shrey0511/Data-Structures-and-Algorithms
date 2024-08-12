//https://leetcode.com/problems/climbing-stairs/

public class climbingStairs_70 {
    public static void main(String[] args) {
        
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        if(dp.length > 2) dp[2] = 2;
        for(int i = 3 ; i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
