//https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/?envType=daily-question&envId=2024-08-04

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class code {
    
    public static void main(String[] args) {
        
    }

    public int rangeSum(int[] nums, int n, int left, int right) {
        int ans = 0;
        List<Integer> newList = new ArrayList<>();
        for(int i = 0 ; i<nums.length ; i++){
            int sum = 0;
            for(int j = i ; j<nums.length ; j++){
                sum += nums[j];
                newList.add(sum);
            }
        }

        Collections.sort(newList);

        for(int j = left-1 ; j<right ; j++){
            ans = (ans + newList.get(j)) % 1000000007;
        }
        return ans;
    }
    // public int rangeSumRec(int[] nums, int n, int left, int right) {
    //     int ans = 0;
    //     List<Integer> newList = new ArrayList<>();
    //     for(int i = 0 ; i<nums.length ; i++){
    //         subArray(newList , nums , i , 0);
    //     }

    //     Collections.sort(newList);

    //     for(int j = left-1 ; j<right ; j++){
    //         ans = (ans + newList.get(j)) % 1000000007;
    //     }
    //     return ans;
    // }
    // private void subArray(List<Integer> list , int[] arr , int index , int currSum ){
    //     if(index == arr.length)
    //         return;

    //     currSum += arr[index];
    //     list.add(currSum);

    //     subArray(list,arr,index+1,currSum);
    // }
}
