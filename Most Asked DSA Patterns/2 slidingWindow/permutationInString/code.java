//https://leetcode.com/problems/permutation-in-string/

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }

    static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        int front = 0 , back = s1.length();
        for(int i = 0 ; i<s1.length() ; i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;//Setting window of 2 characs.
        }
        if(Arrays.equals(arr1, arr2)) return true;

        while (back < s2.length()) {
            arr2[s2.charAt(front)]--;
            arr2[s2.charAt(back)]++;

            if(Arrays.equals(arr1, arr2)) return true;
            front++;back++;
        }
        return false;
    }
}
