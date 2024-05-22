//https://leetcode.com/problems/score-after-flipping-matrix/?envType=daily-question&envId=2024-05-13

public class code {
    public static void main(String[] args) {
        
    }
    static int matrixScore(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        int ans = (1<< (m-1)) * n;

        for(int j = 1 ; j<m ; j++){
            int val = 1<<(m-1-j);
            int set = 0;

            for(int i = 0 ; i<n ; i++){
                //As we take first col as 1 whole so we match it with col1
                if(grid[i][j]==grid[i][0]){
                    set++;
                }
            }
            //We calculate max value out of set bits or after flipping each bit
            ans += Math.max(set,n-set) * val;
        }
        return ans;
    }
}
