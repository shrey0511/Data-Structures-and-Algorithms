//https://leetcode.com/problems/to-lower-case/description/

public class lowerCase {
    public static void main(String[] args) {
        
    }
    static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            sb.append(c>64 && c<91?(char)(c+32):c);
        }
        return new String(sb);
    }
}
