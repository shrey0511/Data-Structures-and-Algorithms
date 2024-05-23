//https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }   
    static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);
        int curr = 1;
        for(int i=0;i<n;i++){//To add values lying before the current number
            ans[i] = ans[i]*curr;
            curr *= nums[i];//To avoid the product by self we update curr after adding value to ans[i]
        }
        curr = 1;
        for(int i=n-1;i>=0;i--){//To add the values lying after the current number
            ans[i] = ans[i]*curr;
            curr *= nums[i];
        }

        return ans;
    } 
}
