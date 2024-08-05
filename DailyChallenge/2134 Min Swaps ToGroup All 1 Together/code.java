//https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/?envType=daily-question&envId=2024-08-02

public class code {
    public static void main(String[] args) {
        
    }

    public int minSwaps(int[] nums) {
        int countOne = 0;
        for(int num : nums){
            countOne += num;
        }

        int count = 0 , max = 0;
        for(int i = 0 ; i<countOne ; i++){
            count += nums[i];
        }
        //No. of ones in first window stored in count
        max = count;
        for(int i = countOne ; i < nums.length+countOne ; i++){
            count += nums[i % nums.length] - nums[(i - countOne) % nums.length];
            max = Math.max(max , count);
        }

        return countOne - max;
    }
}
