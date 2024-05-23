//https://leetcode.com/problems/split-two-strings-to-make-palindrome/description/

public class splitStrings {
    public static void main(String[] args) {
        
    }
    static boolean checkPalindromeFormation(String a, String b) {
        return validate(a,b) || validate(b,a);
    }
    static boolean validate(String x,String y){
        int l = 0 , r = x.length()-1;
        while(l<=r){
            if(x.charAt(l)!=y.charAt(r))
                break;
            l++;r--;
        }
        return validate(x,l,r) || validate(y,l,r);
    }
    static boolean validate(String x,int l,int r){
        while(l<=r){
            if(x.charAt(l)!=x.charAt(r))
                break;
            l++;r--;
        }
        return l>=r;
    }
}
