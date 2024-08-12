//https://leetcode.com/problems/unique-paths-ii/

package _2D;

import java.util.Arrays;

public class UniquePathsII_63 {
    public static void main(String[] args) {
        
    }

    //Using memoization
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length , col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];

        for(int[] r : dp){
            Arrays.fill(r,-1);
        }

        return helper(obstacleGrid , dp , row-1 , col-1);
    }

    public int helper(int[][] grid , int[][] dp , int row , int col){

        if(row < 0 && col < 0 || grid[row][col] == 1) return 0;

        if(row == 0 && col == 0) return 1;

        if(dp[row][col] != -1) return dp[row][col];

        int left = (col>0) ? helper(grid , dp , row , col-1) : 0;
        int up = (row>0) ? helper(grid , dp , row-1 , col) : 0;

        return dp[row][col] = left + up;
    }

    //Tabulation
    public int uniquePathsWithObstaclesTab(int[][] obstacleGrid) {
        int row = obstacleGrid.length , col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];

        dp[0][0] = 1;

        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){

                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }else if(i == 0 && j == 0){
                    dp[i][j] = 1;
                    continue; 
                }else{
                    int left = 0 , up = 0;
                    left = (j>0) ? dp[i][j-1] : 0;
                    up = (i>0) ? dp[i-1][j] : 0;

                    dp[i][j] = left + up;
                }
                
            }
        }
        return dp[row-1][col-1];
    }
}
