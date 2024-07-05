//https://leetcode.com/problems/path-with-maximum-gold/

public class code {
    public static void main(String[] args) {
        
    }

    static int getMaximumGold(int[][] grid) {
        boolean[][] path = new boolean[grid.length][grid[0].length];
        int max = 0;

        for(int i=0 ; i<grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] != 0){
                    path[i][j] = true;
                    max = Math.max(max , helper(grid , path , i , j , grid[i][j]));
                    path[i][j] = false;
                }
            }
        }
        return max;
    }

    private static int helper(int[][] grid , boolean[][] path , int r , int c , int sum){
        int res = sum;//Starting gold

        //Base condition
        if(r < 0 || r > grid.length-1 || c < 0 || c > grid[0].length-1 || grid[r][c] == 0){
            return sum;
        }

        if(r < grid.length-1 && !path[r+1][c]){
            path[r+1][c] = true;
            res = Math.max(res , helper(grid , path , r+1 , c , sum+grid[r+1][c])); 
            path[r+1][c] = false;
        }

        if(r > 0 && !path[r-1][c]){
            path[r-1][c] = true;
            res = Math.max(res,helper(grid , path , r-1 , c , sum+grid[r-1][c]));
            path[r-1][c] = false;
        }

        if(c < grid[0].length-1 && !path[r][c+1]){
            path[r][c+1] = true;
            res = Math.max(res,helper(grid , path , r , c+1 , sum+grid[r][c+1]));
            path[r][c+1] = false;
        }
        
        if(c > 0 && !path[r][c-1]){
            path[r][c-1] = true;
            res = Math.max(res,helper(grid , path , r , c-1 , sum+grid[r][c-1]));
            path[r][c-1] = false;
        }
        return res;
    }
}
