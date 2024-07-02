//https://leetcode.com/problems/intersection-of-two-arrays-ii/?envType=daily-question&envId=2024-07-02

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        // Sort both the arrays first...
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // Create an array list...
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // Use two pointers i and j for the two arrays and initialize both with zero.
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            // If nums1[i] is less than nums2[j]...
            // Leave the smaller element and go to next(greater) element in nums1...
            if(nums1[i] < nums2[j]) {
                i++;
            }
            // If nums1[i] is greater than nums2[j]...
            // Go to next(greater) element in nums2 array...
            else if(nums1[i] > nums2[j]){
                j++;
            }
            // If both the elements intersected...
            // Add this element to arr & increment both i and j.
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        // Create a output list to store the output...
        int[] output = new int[arr.size()];
        int k = 0;
        while(k < arr.size()){
            output[k] = arr.get(k);
            k++;
        }
        return output;
    }

    //If one is shorter than the other
    public int[] intersect2(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        int i = 0;
        int len = 0;

        if(nums1.length < nums2.length){
            len = nums2.length;
            while(i<nums1.length){
                map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
                i++;
            }
            for(int j = 0 ; j<len ; j++){
                if(map.containsKey(nums2[j]) && map.get(nums2[j]) > 0){
                    list.add(nums2[j]);
                    map.put(nums2[j],map.get(nums2[j])-1);
                }
            }
        }else{
            len = nums1.length;
            while(i<nums2.length){
                map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
                i++;
            }
            for(int j = 0 ; j<len ; j++){
                if(map.containsKey(nums1[j]) && map.get(nums1[j]) > 0){
                    list.add(nums1[j]);
                    map.put(nums1[j],map.get(nums1[j])-1);
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int k = 0 ; k<ans.length ; k++){
            ans[k] = list.get(k);
        }
        return ans;
    }
}
