//https://leetcode.com/problems/minimum-path-sum/

package _2D;

import java.util.Arrays;

public class MinPathSum_64 {
    public static void main(String[] args) {
        
    }

    //Memoization
    public int minPathSum(int[][] grid) {
        int row = grid.length , col = grid[0].length;
        int[][] dp = new int[row][col];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }

        return helper(grid , dp , row-1 , col-1);
    }
    public int helper(int[][] grid , int[][] dp , int r , int c){
        if(r == 0 && c == 0){
            return grid[0][0];
        }

        if(r < 0 || c < 0){
            return Integer.MAX_VALUE;
        }

        if(dp[r][c] != -1){
            return dp[r][c];
        }

        int left = helper(grid , dp , r , c-1); 
        int up = helper(grid , dp , r-1 , c);

        return dp[r][c] = grid[r][c] + Math.min(left , up);
    }

    //Tabulation
    public int minPathSumTab(int[][] grid) {
        int row = grid.length , col = grid[0].length;
        int[][] dp = new int[row][col];

        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = grid[0][0];
                    continue;
                }else{
                    int left = 0 , up = 0;
                    if(j>0)
                        left = dp[i][j-1];
                    if(i>0)
                        up = dp[i-1][j];

                    dp[i][j] = grid[i][j] + Math.min(left , up);
                }
            }
        }
        return dp[row-1][col-1];
    }

}
