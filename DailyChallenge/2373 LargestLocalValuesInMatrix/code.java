//https://leetcode.com/problems/largest-local-values-in-a-matrix/description/?envType=daily-question&envId=2024-05-12

public class code {
    public static void main(String[] args) {
        
    }
    static int[][] largestLocal(int[][] grid){
        int[][] maxLocal = new int[grid.length][grid[0].length];
        for(int i=1;i<grid.length-1;i++){//Borders chhodke
            for(int j=1;j<grid[0].length-1;j++){//Borders chhodke
                int temp = 0;
                //take out max of n-2 matrix
                for(int k=i-1;k<=i+1;++k){
                    for(int l=j-1;l<=j+1;++l){
                        temp = Math.max(temp, grid[k][l]);
                    }
                }
                maxLocal[i-1][j-1] = temp;
            }
        }
        return maxLocal;
    }
}
