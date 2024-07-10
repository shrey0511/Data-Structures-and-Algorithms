//https://leetcode.com/problems/decode-string/

import java.util.Stack;

public class code {
    public static void main(String[] args) {
        
    }

    static String decodeString(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int k = 0;

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == '['){
                s1.push(k);
                k=0;
                str.push(sb);
                sb = new StringBuilder();
            }else if(ch == ']'){
                int n = s1.pop();
                StringBuilder temp = sb;
                sb = str.pop();

                for(int j = 0 ; j<n ; j++){
                    sb.append(temp);
                }
            }else if(Character.isDigit(ch)){
                k = (k*10) + (ch - '0');
            }else{
                sb.append(ch); //Alphabet
            }
        }
        return sb.toString();
    }
}
