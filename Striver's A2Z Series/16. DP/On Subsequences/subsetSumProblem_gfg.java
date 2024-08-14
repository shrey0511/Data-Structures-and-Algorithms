//https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1

import java.util.Arrays;

public class subsetSumProblem_gfg {

    public static void main(String[] args) {
        
    }

    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        // Create a DP table with dimensions [n][k+1]
        int dp[][] = new int[N][sum + 1];

        // Initialize DP table with -1 (unprocessed)
        for (int row[] : dp)
            Arrays.fill(row, -1);
            
        return helper(arr, dp ,N-1 , sum);
    }
    static Boolean helper(int[] arr ,int[][] dp ,int ind , int target){
        if(target == 0)
            return true;
            
        if(ind == 0)
            return arr[0] == target;
            
        if(dp[ind][target] != -1)
            return (dp[ind][target] == 1) ? true : false;
            
            
        Boolean taken = false;
        if(arr[ind] <= target)
            taken = helper(arr,dp,ind-1,target-arr[ind]);
            
        Boolean notTaken = helper(arr,dp,ind-1,target);
        
        dp[ind][target] = (taken || notTaken) ? 1 : 0;
        
        return taken || notTaken;
    }

    //Tabulation
    static boolean isSubsetSumTab(int N, int arr[], int sum){
        // code here
        boolean dp[][] = new boolean[N][sum + 1];

        for(int i = 0 ; i<N ; i++) dp[i][0] = true;
        if(arr[0] <= sum) dp[0][arr[0]] = true;
        
        for(int ind = 1 ; ind<N ; ind++){
            for(int target = 1 ; target<=sum ; target++){
                boolean taken = false;
                if(arr[ind] <= target){
                    taken = dp[ind-1][target-arr[ind]];
                }
                boolean notTaken = dp[ind-1][target];
                dp[ind][target] = taken || notTaken;
            }
        }
        return dp[N-1][sum];
    }
}