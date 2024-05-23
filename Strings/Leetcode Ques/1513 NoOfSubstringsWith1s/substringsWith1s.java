//https://leetcode.com/problems/number-of-substrings-with-only-1s/description/

public class substringsWith1s {
    public static void main(String[] args) {
        
    }
    static int numSub(String s) {
        int mod = 1000000007 , ones = 0;
        long count = 0;
        for(char ch : s.toCharArray()){
            if(ch=='0'){
                ones = 0;
            }else{
                count = count + (++ones);
            }
        }
        return (int) (count%mod);
    }
}
