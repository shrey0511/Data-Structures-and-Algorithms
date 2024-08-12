//https://leetcode.com/problems/minimum-number-of-days-to-disconnect-island/?envType=daily-question&envId=2024-08-11

public class code {
    public static void main(String[] args) {
        
    }

    public int minDays(int[][] grid) {
        if(countIslands(grid) != 1){
            return 0;
        }

        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 0;
                    if(countIslands(grid) != 1) return 1;
                    grid[i][j] = 1;
                }
            }
        }
        return 2;
    }

    public int countIslands(int[][] grid){
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        int islands = 0;
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j] == 1 && !seen[i][j]){
                    islands++;
                    dfs(grid,seen , i , j);
                }
            }
        }
        return islands;
    }

    public void dfs(int[][] grid  ,boolean[][] seen , int r , int c){
        seen[r][c] = true;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        for(int[] dir : directions){
            int dr = r + dir[0] , dc = c + dir[1];
            if(dr >= 0 && dr < seen.length && dc >= 0 && dc < seen[0].length && grid[dr][dc] == 1 && !seen[dr][dc]){
                dfs(grid, seen , dr , dc);
            }
        }
    }
}
