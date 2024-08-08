//https://leetcode.com/problems/spiral-matrix-iii/?envType=daily-question&envId=2024-08-08

public class code {
    public static void main(String[] args) {
        
    }

    int index = 1;
    int row,col,rows,cols;
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows*cols][2];
        row = rStart;
        col = cStart;
        this.rows = rows;
        this.cols = cols;

        int moves = 0;

        result[0] = new int[]{rStart,cStart};
        while(index < result.length){
            ++moves;
            addToResult(result , moves , 0 , 1);
            addToResult(result , moves , 1 , 0);
            ++moves;
            addToResult(result , moves , 0 , -1);
            addToResult(result , moves , -1 , 0);
        }
        return result;
    }

    public void addToResult(int[][] result , int moves , int horizontal , int vertical){
        for(int i = 0 ; i<moves ; i++){
            row += horizontal;
            col += vertical;
            if(row < rows && row > -1 && col < cols && col > -1){
                result[index] = new int[]{row,col};
                index++;
            } 
        }
    }
}
