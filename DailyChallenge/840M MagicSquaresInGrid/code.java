//https://leetcode.com/problems/magic-squares-in-grid/?envType=daily-question&envId=2024-08-09

public class code {
    public static void main(String[] args) {
        
    }

    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length , cols = grid[0].length , count = 0;

        for(int i = 0 ; i <= rows-3 ; i++){
            for(int j = 0 ; j <= cols-3 ; j++){
                if(isMagicSquare(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isMagicSquare(int[][] grid , int x , int y){
        int sum = grid[x][y] + grid[x+1][y] + grid[x+2][y];

        //Check for number range and unequality
        boolean[] seen = new boolean[10];
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                int num = grid[i+x][j+y];
                if(num < 1 || num > 9 || seen[num])
                    return false;
                seen[num] = true;
            }
        }

        //Check for rows
        for(int i = 0 ; i<3 ; i++){
            if(sum != grid[i+x][y] + grid[i+x][y+1] + grid[i+x][y+2])
                return false;
        }
        //Check for cols
        for(int i = 0 ; i<3 ; i++){
            if(sum != grid[x][y+i] + grid[x+1][y+i] + grid[x+2][y+i])
                return false;
        }

        //Check diagonals
        if(sum != grid[x][y] + grid[x+1][y+1] + grid[x+2][y+2])
            return false;
        if(sum != grid[x+2][y] + grid[x+1][y+1] + grid[x][y+2])
            return false;
    
        return true;
    }
}
