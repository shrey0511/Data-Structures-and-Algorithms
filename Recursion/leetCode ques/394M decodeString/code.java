//https://leetcode.com/problems/decode-string/

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    static int i = 0;

    static String decodeString(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String temp = "";

        while(i<s.length()){
            char c = s.charAt(i);
            i++;

            if(c == '['){
                temp = decodeString(s);
                for(int j = 0 ; j<count ; j++){
                    sb.append(temp);
                }
                count = 0;
            }else if(c == ']'){
                break;
            }else if(Character.isAlphabetic(c)){
                sb.append(c);
            }else{
                count = count * 10 + c - '0';
            }
        }
        return sb.toString();
    }
}
