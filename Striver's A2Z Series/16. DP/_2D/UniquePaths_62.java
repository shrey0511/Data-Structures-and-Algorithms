package _2D;

//https://leetcode.com/problems/unique-paths/

import java.util.Arrays;


public class UniquePaths_62 {
    public static void main(String[] args) {
        
    }

    //Memoization approach
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        int[][] dp = new int[m][n];

        for(int i = 0 ; i<grid.length ; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(grid , dp , 0 , 0);
    }

    public int helper(int[][] grid , int[][] dp , int row , int col){
        if(row == grid.length-1 && col == grid[0].length-1 ){
            return 1;
        }
        if(row >= grid.length || col >= grid[0].length)
            return 0;

        if(dp[row][col] != -1)
            return dp[row][col];

        int right = helper(grid , dp , row , col+1);
        int down = helper(grid , dp , row+1 , col);

        return dp[row][col] = right + down;
    }

    //Tabulation
    //Start from the last cell back to the beginning
    public int uniquePathsTab(int m , int n){
        int[][] dp = new int[m][n];

        dp[0][0] = 1;

        for(int row = 0 ; row<m ; row++){
            for(int col = 0 ; col<n ; col++){

                if(row == 0 && col == 0){
                    dp[row][col] = 1;
                    continue;
                } 
                else{
                    int left = 0 , up = 0;
                    if(col > 0)
                        left = dp[row][col-1];
                    if(row > 0)
                        up = dp[row-1][col];

                    dp[row][col] = left+up;
                }
            }
        }

        return dp[m-1][n-1];
    }

}
