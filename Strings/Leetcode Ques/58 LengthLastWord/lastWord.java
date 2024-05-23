//https://leetcode.com/problems/length-of-last-word/description/

public class lastWord {
    public static void main(String[] args) {
        
    }
    static int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int ans=0;
        for(int i=trimmed.length()-1;i>=0;i--){
            if(trimmed.charAt(i)!=' '){
                ans++;
            }else
                break;
        }
        return ans;
    }
}
