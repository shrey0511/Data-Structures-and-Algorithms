//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;

public class LogestSubstringWithoutRepeating_3 {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        //Will be using two pointers
        //One passes till we get an already encountered char
        int length = 0 , right = 0 , left = 0;

        HashSet<Character> set = new HashSet<>();

        while(right < s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                length = Math.max(length , right-left+1);
            }else if(set.contains(c)){
                while(set.contains(c)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(c);
            }
            right++;
        }
        return length;
    }
}
