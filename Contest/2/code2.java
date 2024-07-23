//https://leetcode.com/contest/biweekly-contest-135/problems/minimum-length-of-string-after-operations/

import java.util.HashMap;

public class code2 {
    public static void main(String[] args) {
        
    }

    public int minimumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int length = s.length();

        for(char c : s.toCharArray()){
            if(map.containsKey(c) && map.get(c)>=2){
                map.put(c , map.get(c)-2);
                length -= 2;
            }
            map.put(c , map.getOrDefault(c,0)+1);
        }
        return length;
    }
}
