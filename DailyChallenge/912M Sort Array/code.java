//https://leetcode.com/problems/sort-an-array/?envType=daily-question&envId=2024-07-25

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }

    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    private int[] mergeSort(int[] nums){
        if(nums.length == 1)
            return nums;

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums , 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums ,mid , nums.length));

        return merge(left , right);
    }

    private int[] merge(int[] left , int[] right){
        int[] mix = new int[left.length+right.length];

        int i = 0 , j = 0 , k = 0;

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                mix[k] = left[i++];
            }else{
                mix[k] = right[j++];
            }
            k++;
        }
        while(i < left.length){
            mix[k++] = left[i++];
        }
        while(j < right.length){
            mix[k++] = right[j++];
        }

        return mix;
    }

    // public int[] sortArray(int[] nums) {
    //     int i = 0;
    //     PriorityQueue<Integer> pq = new PriorityQueue<>();
    //     for(int num : nums){
    //         pq.offer(num);
    //     }

    //     int[] res = new int[nums.length];
    //     while(!pq.isEmpty()){
    //         res[i++] = pq.poll();
    //     }
    //     return res;
    // }
}
