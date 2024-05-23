//https://leetcode.com/problems/count-number-of-homogenous-substrings/

public class homoSubStrings {
    public static void main(String[] args) {
        
    }
    static int countHomogenous(String s) {
        int left = 0;
        int mod = 1000000007;
        long result = 0;
        for(int right = 0 ; right<s.length() ; right++){
            if(s.charAt(right)==s.charAt(left)){
                result += right-left+1;
            }else{
                result+=1;
                left=right;
            }
        }
        return (int) (result % mod);
    }
}
