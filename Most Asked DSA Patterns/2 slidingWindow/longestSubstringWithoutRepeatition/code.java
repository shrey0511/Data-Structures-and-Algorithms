//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashSet;

public class code {
    public static void main(String[] args) {
        
    }

    static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        int left = 0 , right = 0;
        for( ; right<s.length() ; right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                length = Math.max(right-left+1,length);
            }else{
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }
        return length;
    }
}
