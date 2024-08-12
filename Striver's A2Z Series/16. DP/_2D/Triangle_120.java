//https://leetcode.com/problems/triangle/

package _2D;

import java.util.Arrays;
import java.util.List;

public class Triangle_120 {
    public static void main(String[] args) {
        
    }

    //Memoization
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size() , col = triangle.get(triangle.size()-1).size();
        int[][] dp = new int[row][col];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }

        return helper(triangle , dp , 0 , 0);

    }

    public int helper(List<List<Integer>> triangle , int[][] dp , int ind1 , int ind2){
        
        if(dp[ind1][ind2] != -1)
            return dp[ind1][ind2];

        if(ind1 == triangle.size()-1){
            return triangle.get(ind1).get(ind2); 
        }

        int down = helper(triangle , dp , ind1 + 1 , ind2);
        int downR = helper(triangle , dp , ind1 + 1 , ind2 + 1);

        return dp[ind1][ind2] = triangle.get(ind1).get(ind2) + Math.min(down , downR);
    }

    //Tabulation
    public int minimumTotalTab(List<List<Integer>> triangle) {
        int row = triangle.size() , col = triangle.get(triangle.size()-1).size();
        int[][] dp = new int[row][col];

        for(int i = 0 ; i<row ; i++)
            //Base case
            dp[row-1][i] = triangle.get(row-1).get(i);

        for(int j = row-2 ; j>=0 ; j--){
            for(int k = j ; k>=0 ; k--){//Since it is a triangle
                int down = dp[j+1][k];
                int downR = dp[j+1][k+1];

                dp[j][k] = triangle.get(j).get(k) + Math.min(down , downR);
            }
        }

        return dp[0][0];
    }
}
