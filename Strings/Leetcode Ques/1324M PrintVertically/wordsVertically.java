//https://leetcode.com/problems/print-words-vertically/description/

import java.util.ArrayList;
import java.util.List;

public class wordsVertically {
    public static void main(String[] args) {
        String s = "HOW ARE YOU";
        System.out.println(printVertically(s));
    }
    static List<String> printVertically(String s) {
        List<String> ans = new ArrayList<>();
        String[] arr = s.split(" ");
        int maxlength = 0;
        for(String word:arr){
            maxlength = Math.max(maxlength,word.length());
        }
        int i = 0;
        while(i<maxlength){
            StringBuilder sb = new StringBuilder();
            for(String word:arr){
                sb.append(i<word.length()? word.charAt(i):' ');
            }
            while(sb.charAt(sb.length()-1) == ' '){
                sb.deleteCharAt(sb.length()-1);
            }
            ans.add(sb.toString());
            i++;
        }
        return ans;
    }
}
