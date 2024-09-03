//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75

public class isSubsequence_392 {
    public static void main(String[] args) {
        
    }

    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0 || s.equals(t))
            return true;
        int pt1 = 0 , pt2 = 0;

        while(pt2 < t.length()){
            if(pt1 == s.length())
                break;
            if(s.charAt(pt1) == t.charAt(pt2)){
                pt1++;
            }
            pt2++;
        }
        return pt1 == s.length();
    }
}
