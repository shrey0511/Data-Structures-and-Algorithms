//https://leetcode.com/problems/swap-adjacent-in-lr-string/description/

public class adjacentSwapLRstring {
    public static void main(String[] args) {
        
    }
    static boolean canTransform(String start, String end) {
        int i = 0 , j = 0;
        char[] s = start.toCharArray();
        char[] e = end.toCharArray();

        while(i<s.length || j<e.length){
            while(i<s.length && s[i]=='X') i++;
            while(j<e.length && e[j]=='X') j++;

            if(i>=s.length || j>=e.length) break;

            if(s[i]!=e[j]) return false;
            if(s[i]=='R' && i>j) return false;
            if(s[i]=='L' && i<j) return false;

            i++;j++;
        }

        return i == j;
    }
}
