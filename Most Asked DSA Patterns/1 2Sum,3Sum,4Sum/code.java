//https://www.geeksforgeeks.org/check-if-pair-with-given-sum-exists-in-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        if(n<=1) return false;
        Arrays.sort(arr);
        int l = 0 , r = n-1;
        while(l < r){
            if(arr[l]+arr[r] == x)
                return true;
            else if(arr[l]+arr[r] < x){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }

    //3 sum
    //https://leetcode.com/problems/3sum/

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        if(nums.length <=2) return ans;
        for(int i = 0 ; i<nums.length - 2 ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1  , k = nums.length - 1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ans.add(Arrays.asList(new Integer[]{nums[i],nums[j],nums[k]} ));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;//To avoid duplicates
                    while(j<k && nums[k] == nums[k+1]) k--; 
                }
            }
        }
        return ans;
    }
}
