//https://leetcode.com/problems/subarray-sums-divisible-by-k/?envType=daily-question&envId=2024-06-09

public class code {
    public static void main(String[] args) {
        
    }

    static int subarraysDivByK(int[] nums, int k) {
        int[] counting = new int[k];
        for (int i = 0, remainder = 0; i < nums.length; i++) {
            remainder = ((remainder + nums[i]) % k + k) % k;
            counting[remainder]++;
        }
        //To find all the combinations
        int result = counting[0];
        for (int frequency : counting)
            result += frequency * (frequency - 1) / 2;
        return result;
    }
}
