//https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/description/

public class deleteSimilarEnds {
    public static void main(String[] args) {
        
    }
    static int minimumLength(String s) {
        int l = 0 , r = s.length() - 1;
        while(l<r && s.charAt(l)==s.charAt(r)){
            char ch = s.charAt(l);
            while(l<=r && s.charAt(l)==ch) l++;
            while(l<=r && s.charAt(r)==ch) r--;
        }
        return r-l+1;
    }
}
