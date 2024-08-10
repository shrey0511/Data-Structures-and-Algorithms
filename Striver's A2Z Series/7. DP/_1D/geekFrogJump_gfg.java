//https://www.geeksforgeeks.org/problems/geek-jump/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=geek-jump

import java.util.Arrays;

public class geekFrogJump_gfg {
    public static void main(String[] args) {
        
    }

    //Memoization
    public int minimumEnergyRec(int arr[],int N){
        //code here
        int[] dp = new int[N];
        Arrays.fill(dp,-1);
        return solve(arr,dp,N-1);
    }

    private int solve(int[] arr, int[] dp, int i) {
        if(i == 0) return 0;
        
        if(dp[i] != -1) return dp[i];

        int jumpOne = solve(arr, dp, i-1) + Math.abs(arr[i] - arr[i-1]);
        int jumpTwo = Integer.MAX_VALUE;
        
        if(i > 1)
            jumpTwo = solve(arr, dp, i-2) + Math.abs(arr[i] - arr[i-2]);

        return dp[i] = Math.min(jumpOne,jumpTwo);
    }

    //Tabulation
    public int minimumEnergy(int arr[],int N){
        //code here
        int[] dp = new int[N];
        dp[0] = 0;
        int jumpTwo = Integer.MAX_VALUE;
        for(int i = 1 ; i<N ; i++){
            int jumpOne = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            if(i>1){
                jumpTwo = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
            }
            dp[i] = Math.min(jumpOne,jumpTwo);
        }
        return dp[N-1];
    }

    //Optimized
    public int minimumEnergyOP(int arr[],int N){
        //code here
        int prev = 0 , prev2 = 0;
        int jumpTwo = Integer.MAX_VALUE;
        for(int i = 1 ; i<N ; i++){
            int jumpOne = prev + Math.abs(arr[i] - arr[i-1]);
            if(i>1){
                jumpTwo = prev2 + Math.abs(arr[i] - arr[i-2]);
            }
            int curr = Math.min(jumpOne,jumpTwo);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
