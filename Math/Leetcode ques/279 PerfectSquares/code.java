//https://leetcode.com/problems/perfect-squares/

//revisit for sure and learn dp before that
public class code {
    public static void main(String[] args) {
        
    }
    static int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1 ; i<=n ; i++){
            int min_val = Integer.MAX_VALUE;
            for(int j = 1; j*j<=i ; j++){
                int square = j*j;
                //1 is added as we use one square in each loop
                //then use sum from using function for value-currSquare
                min_val = Math.min(min_val , 1 + dp[i-square]);
            }
            dp[i] = min_val;
        }
        return dp[n];
    }
}
