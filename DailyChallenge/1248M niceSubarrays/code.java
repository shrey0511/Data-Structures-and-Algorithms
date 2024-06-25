//https://leetcode.com/problems/count-number-of-nice-subarrays/?envType=daily-question&envId=2024-06-22

public class code {
    public static void main(String[] args) {
        
    }

    static int numberOfSubarrays(int[] nums, int k) {
        int left = 0 , right = 0 , count = 0 , ans = 0 , temp = 0;
        for( ; right<nums.length ; right++){
            if(nums[right] % 2 != 0){
                count++;
                temp = 0;
            }

            while(count == k){
                temp++;
                if(nums[left] % 2 != 0){
                    count--;
                }
                left++;
            }
            ans += temp;
        }
        return ans;
    }
}
