//https://leetcode.com/problems/camelcase-matching/description/

import java.util.ArrayList;
import java.util.List;

public class camelCase {
    public static void main(String[] args) {
        
    }
    static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> answer = new ArrayList<>();
        for(var q : queries){
            int index = 0;
            boolean flag = true;
            for(var c : q.toCharArray()){
                if(index < pattern.length() && c == pattern.charAt(index)){
                    index++;
                    continue;
                }
                if(c>= 'A' && c<= 'Z'){
                    if(index >= pattern.length() || c!=pattern.charAt(index)){
                        flag = false;
                        break;
                    }
                }
            }
            flag = flag && index == pattern.length();
            answer.add(flag);
        }
        return answer;
    }
}
