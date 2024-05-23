//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/

public class decryptString {
    public static void main(String[] args) {
        
    }
    static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = s.length()-1;i>=0;){
            int number;
            if(s.charAt(i)=='#'){
                number=(s.charAt(i-2)-'0')*10 +((s.charAt(i-1))-'0');
                i-=3;
            }else{
                number = s.charAt(i)-'0';
                i--;
            }
            sb.append((char) (number+96));
        }
        return sb.reverse().toString();
    }
}
