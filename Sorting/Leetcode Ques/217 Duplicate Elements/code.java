//https://leetcode.com/problems/contains-duplicate/description/

import java.util.HashSet;

public class code {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,5,3,3};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
            if(seen.contains(num))
                return true;
            seen.add(num);    
        }    
        return false;
    }
}
