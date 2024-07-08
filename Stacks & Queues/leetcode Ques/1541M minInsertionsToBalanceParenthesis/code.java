//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/


public class code {
    public static void main(String[] args) {
        
    }

    static int minInsertions(String s) {
        int count = 0 , openCount = 0;

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                openCount++;
            }else{
                if(i+1 < s.length() && s.charAt(i+1) == ')'){
                    i++;
                }else{
                    count++;
                }

                if(openCount > 0){
                    openCount--;
                }else{
                    count++;
                }
            }
        }

        count += openCount * 2;

        return count;
    }
}
