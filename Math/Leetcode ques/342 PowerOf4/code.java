//https://leetcode.com/problems/power-of-four/

public class code {
    public static void main(String[] args) {
        
    }
    static boolean isPowerOfFour(int n) {
        return n>0 && (n&(n-1))==0 && n%3==1;
    }
    //Check for positive then
    //Check if n is a power of 2 using n and n-1 then
    //Check if power is not divisible by 3 then power can be for 2&4
}
