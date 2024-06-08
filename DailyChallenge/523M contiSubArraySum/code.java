//https://leetcode.com/problems/continuous-subarray-sum/description/?envType=daily-question&envId=2024-06-08

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int n = sb.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sb.nextInt();
        }
        System.out.println("Enter the value of k, the number you want to divide from: ");
        int k = sb.nextInt();
        System.out.println(checkSubarraySum(arr,k));
    }

    static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            sum += nums[i];
            sum %= k;//Remainder

            if(sum == 0 && i>0)
                return true;
            if(map.containsKey(sum) && i - map.get(sum) > 1){//Check if atleast 2 nos are there
                return true;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return false;
    }
}
