//https://leetcode.com/problems/binary-number-with-alternating-bits/

public class code {
    public static void main(String[] args) {
        
    }
    static boolean hasAlternatingBits(int n) {
        while(n>0){
            int val1 = n&1;
            n = n>>1;
            int val2 = n&1;
            if((val1^val2)==0)
                return false;
        }
        return true;
    }
}
