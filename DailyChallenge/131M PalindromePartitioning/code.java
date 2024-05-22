//https://leetcode.com/problems/palindrome-partitioning/description/?envType=daily-question&envId=2024-05-22

import java.util.ArrayList;
import java.util.List;

class code{
    public static void main(String[] args) {
        
    }
    static List<List<String>> partition(String s){
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    static void backtrack(String s,int start,List<String> path,List<List<String>> result){
        //Check if you reached end of string, yes then add the current path
        if(start == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int end = start+1 ; end<=s.length() ; end++){
            //If a palindrome then add to path and look for other partitions
            if(isPalindrome(s, start, end-1)){
                path.add(s.substring(start, end));

                backtrack(s, end, path, result);

                path.remove(path.size()-1);
            }
        }
    }

    static boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--))
                return false;
        }
        return true;
    }
}