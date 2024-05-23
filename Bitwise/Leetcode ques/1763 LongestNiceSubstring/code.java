//https://leetcode.com/problems/longest-nice-substring/description/

import java.util.HashSet;
import java.util.Set;

public class code {
    public static void main(String[] args) {
        
    }
    static String longestNiceSubstring(String s) {
        var sub = longestNiceSubstring(s,0,s.length());
        return s.substring(sub[0],sub[1]);
    }
    static int[] longestNiceSubstring(String s , int left , int right){
        var charSet = getCharSet(s, left, right);

        for(var i = left ; i<right ; i++){
            if(!charSet.contains(Character.toLowerCase(s.charAt(i))) || !charSet.contains(Character.toUpperCase(s.charAt(i)))){
                var prefix = longestNiceSubstring(s,left,i);
                var suffix = longestNiceSubstring(s,i+1,right);
                return prefix[1] - prefix[0] >= suffix[1] - suffix[0] ? prefix : suffix;
            }
        }
        return new int[]{left,right};
    }
    static Set<Character> getCharSet(String s , int left , int right){
        var charSet = new HashSet<Character>();

        for(var i = left ; i<right;i++){
            charSet.add(s.charAt(i));
        }
        return charSet;
    }
}
