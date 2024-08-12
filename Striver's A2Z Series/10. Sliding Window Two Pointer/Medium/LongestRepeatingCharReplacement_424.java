//https://leetcode.com/problems/longest-repeating-character-replacement/

public class LongestRepeatingCharReplacement_424 {
    public static void main(String[] args) {
        
    }

    public int characterReplacement(String s, int k) {
        int[] res = new int[26];
        int left = 0 , max = 0 , ans = 0;
        for(int right = 0 ; right<s.length() ; right++){
            //Counting no. of occurences of this char
            res[s.charAt(right) - 'A']++;

            max = Math.max(max , res[s.charAt(right) - 'A']);

            //Checking allowed swaps
            if(right - left + 1 - max > k){
                res[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans , right-left+1);
        }
        return ans;
    }
}
