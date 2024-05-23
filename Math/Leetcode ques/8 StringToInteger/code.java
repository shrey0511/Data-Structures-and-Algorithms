//https://leetcode.com/problems/string-to-integer-atoi/

public class code {
    public static void main(String[] args) {
        
    }
    static int myAtoi(String s) {
        int ans = 0; 
        int len = s.length();
        
        if(len==0)
            return 0;
        int index = 0;
        //whitespaces
        while(index<len && s.charAt(index)==' ')
            index++;
        if(index==len)
            return 0;

        //sign
        char ch;
        boolean isNegative = (ch = s.charAt(index))=='-';
        if(isNegative || ch=='+')
            ++index;

        //until no-digit is found & check max limit
        while(index<len && isDigit(ch = s.charAt(index))){
            int digit = s.charAt(index) - '0';
        
            //Checking if adding the new digit will make it overflow
            if(ans>(Integer.MAX_VALUE - digit)/10)
                return isNegative? Integer.MIN_VALUE : Integer.MAX_VALUE;
        
            ans = (ans*10) + digit;
            ++index;
        }
        return isNegative? -ans:ans;
    }
    static boolean isDigit(char ch){
        return ch>='0' && ch<='9';
    }
}
