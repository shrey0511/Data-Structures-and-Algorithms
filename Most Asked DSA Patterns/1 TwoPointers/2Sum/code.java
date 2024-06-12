//https://www.geeksforgeeks.org/check-if-pair-with-given-sum-exists-in-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        System.out.println(twoSum(arr, target));
        
    }

    static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{}; //No solution
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

    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

    static int[] twoSumII(int[] numbers, int target) {
        int start=0,end=numbers.length-1,currSum=0;
        while(start<end){
            currSum = numbers[start]+numbers[end];
            if(currSum==target){
                return new int[]{start+1,end+1};
            }else if(currSum>target){
                end=end-1;;
            }else{
                start=start+1;
            }
        }
        return new int[]{-1,-1};
    }
    
}
