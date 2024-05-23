//https://leetcode.com/problems/merge-sorted-array/submissions/1166852559/

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0} ; 
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
    static void merge(int[] nums1 , int m , int[] nums2 , int n){
        //As nums1 is sorted just insert max element of the two arrays from the end
        int i = m-1 , j = n-1 , k=m+n-1 ;
        while(j>=0){
            //i condition is required if nums1 is empty
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--; 
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
