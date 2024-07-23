//https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/?envType=daily-question&envId=2024-07-20

public class code {
    public static void main(String[] args) {
        
    }

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r = rowSum.length;
        int c = colSum.length;

        int i = r-1 , j = c-1;
        
        int[][] m = new int[r][c];

        while(i>=0 && j>=0){
            if(rowSum[i] <= colSum[j]){
                m[i][j] = rowSum[i];
                colSum[j] -= rowSum[i];
                i--;
            }else{
                m[i][j] = colSum[j];
                rowSum[i] -= colSum[j];
                j--;
            }
        }
        return m;
    }
    
    public int[][] restoreMatrixBrute(int[] rowSum, int[] colSum) {
        int rS = 0 , cS = 0 , r = rowSum.length , c = colSum.length;
        int[][] m = new int[rowSum.length][colSum.length];

        for(int i = 0 ; i<r ; i++){
            for(int j = 0 ; j<c ; j++){
                m[i][j] = Math.min(rowSum[i],colSum[j]);
                rowSum[i] = Math.max(0 , rowSum[i]-m[i][j]);
                colSum[j] = Math.max(0 , colSum[j]-m[i][j]);
            }
        }
        return m;
    }
}
