//https://www.geeksforgeeks.org/problems/minimal-cost/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=minimal-cost

public class frogJumpkTimes_gfg {
    public static void main(String[] args) {
        
    }

    public int minimizeCost(int arr[], int k) {
        // code here
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 0;
        int jump = 0;
        for(int i = 1 ; i<n ; i++){
            int minSteps = Integer.MAX_VALUE;
            for(int j = 1 ; j<=k ; j++){
                if(i-j >= 0){
                    jump = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
                    minSteps = Math.min(minSteps,jump);
                }
            }
            dp[i] = minSteps;
        }
        return dp[n-1];
    }
}
