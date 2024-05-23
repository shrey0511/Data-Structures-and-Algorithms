//https://leetcode.com/problems/get-equal-substrings-within-budget/description/

public class equalSubstringsWithinBudget {
    public static void main(String[] args) {
        
    }
    static int equalSubstring(String s, String t, int maxCost) {
        int[] diff = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int asciiS = s.charAt(i);
            int asciiT = t.charAt(i);
            diff[i] = Math.abs(asciiS - asciiT);
        }
        int maxLen = 0 , start = 0 , currCost = 0;

        for(int end = 0;end<diff.length;end++){
            currCost+=diff[end];
            while(currCost > maxCost){
                currCost-=diff[start];
                ++start;
            }
            maxLen = Math.max(maxLen,end-start+1);
        }
        return maxLen;
    }
}
