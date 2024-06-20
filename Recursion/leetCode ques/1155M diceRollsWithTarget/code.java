//https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }

    static final int MOD = 1000000007;
    static int[][] memo;

    static int numRollsToTarget(int n, int k, int target) {
        // Initialize memoization array
        memo = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }
        
        // Start the recursive function
        return dice(n, k, target);
    }

    static int dice(int n, int k, int target) {
        // Base cases
        if (n == 0) {
            return target == 0 ? 1 : 0;
        }
        if (target < 0) {
            return 0;
        }
        
        // Check if the result is already calculated
        if (memo[n][target] != -1) {
            return memo[n][target];
        }
        
        int count = 0;
        // Explore all possible faces
        for (int i = 1; i <= k; i++) {
            count = (count + dice(n - 1, k, target - i)) % MOD;
        }
        
        // Store the result in the memoization array
        memo[n][target] = count;
        return count;
    }
}
