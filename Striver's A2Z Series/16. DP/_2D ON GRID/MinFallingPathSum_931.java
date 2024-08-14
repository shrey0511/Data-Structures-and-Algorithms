//https://leetcode.com/problems/minimum-falling-path-sum/

package _2D;

public class MinFallingPathSum_931 {
    public static void main(String[] args) {
        
    }

    //Memoization
    //TC : O(N*M) SC: O(N) + O(N*M)
    //In the case of recursion it is , TC : O(N^2)
    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length , col = matrix[0].length;
        int min = Integer.MAX_VALUE;
        //When large test cases use Integer as it has null by default
        //No need of inserting -1 using Arrays.fill
        Integer[][] dp = new Integer[row][col];

        for(int i = 0 ; i<col ; i++){
            min = Math.min(min , helper(matrix , dp , 0 , i , matrix.length));
        }
        return min;
    }

    public int helper(int[][] matrix , Integer[][] dp , int r , int c , int n){

        if(c >= n || c < 0)
            return (int) Math.pow(10, 7);

        if(r == n-1)
            return matrix[r][c];

        if(dp[r][c] != null)
            return dp[r][c];

        int down = helper(matrix , dp , r+1 , c , n);
        int downR = helper(matrix , dp , r+1 , c+1 , n);
        int downL = helper(matrix , dp , r+1 , c-1 , n);
    
        return dp[r][c] = matrix[r][c] + Math.min(down,Math.min(downL,downR));
    }

    //Tabulation

}
