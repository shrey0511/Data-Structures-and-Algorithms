//https://leetcode.com/problems/longest-palindrome/?envType=daily-question&envId=2024-06-04

import java.util.HashSet;

public class code {
    public static void main(String[] args) {
        
    }

    static int longestPalindrome(String s) {
        int length = 0 ;
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            }else{
                length += 2;
                set.remove(c);
            }
        }
        if(!set.isEmpty())
            length += 1;

    return length;
    }
}
