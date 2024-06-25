//https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/?envType=daily-question&envId=2024-06-24

public class code {
    public static void main(String[] args) {
        
    }

    static int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] isFlipped = new int[n];
        int flip = 0; // Number of flips in the current window
        int result = 0; // Total number of flips needed

        for (int i = 0; i < n; i++) {
            // If we have passed a window, subtract its flip effect
            if (i >= k) {
                flip ^= isFlipped[i - k];
            }
            
            // If the current bit is 0 after considering flips, we need to flip it
            if ((nums[i] ^ flip) == 0) {
                // If the flip will go out of bounds, it's impossible to flip the subarray
                if (i + k > n) return -1;

                // Record the flip at the current index
                isFlipped[i] = 1;
                // Update the flip effect in the current window
                flip ^= 1;
                // Increment the result as we have performed a flip
                result++;
            }
        }
        
        return result;
    }
}
