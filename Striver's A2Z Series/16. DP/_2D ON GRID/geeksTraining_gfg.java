package _2D;

import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/geeks-training/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=geeks-training

public class geeksTraining_gfg {
    public static void main(String[] args) {
        
    }

    public int maximumPoints(int arr[][], int N) {
        // code here
        int[][] dp = new int[arr.length][4];
        for(int i = 0 ; i<arr.length ; i++){
            Arrays.fill(dp[i],-1);
        }
        
        return helper(arr,dp,N-1,3);
    }

    private int helper(int[][] arr, int[][] dp, int day, int last) {
        
        if(day == 0){
            int maxi = 0;
            for(int i = 0 ; i<3 ; i++){
                if(i != last)
                    maxi = Math.max(maxi , arr[0][i]);
            }
            return maxi;
        }    

        if(dp[day][last] != -1) return dp[day][last];
        
        int maxi = 0;

        for(int i = 0 ; i<3 ; i++){
            if(i != last){
                int point = arr[day][i] + helper(arr, dp, day-1, last);
                maxi = Math.max(maxi , point);
            }
        }
        return dp[day][last] = maxi;
    }
}
