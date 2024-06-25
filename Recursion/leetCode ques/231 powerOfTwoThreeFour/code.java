//https://leetcode.com/problems/power-of-two/description/

public class code {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(n);
    }

    //Using bitwise
    static boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }

    //Using recursion
    static boolean isPowerOfTwoRec(int n){
        if(n<1)
            return false;
        if(n==1)
            return true;
        if(n%2 != 0)
            return false;

        return isPowerOfTwoRec(n/2);
    }

    //Using recursion
    public boolean isPowerOfThreeRec(int n) {
        if(n<1)
            return false;
        if(n==1)
            return true;
        if(n%3 != 0)
            return false;

        return isPowerOfThreeRec(n/3);
    }

    //Using loop
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        } 
       
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }

    //Using bitwise
    public boolean isPowerOfThreeBit(int n){
        long temp = 1;
        while(n>1 && temp < n){
            temp = temp + (temp<<1);
        }
        return temp == n;
    }

    //Using bitwise
    public boolean isPowerOfFour(int n) {
        return n>0 && (n&(n-1))==0 && n%3==1;
    }
    //Check for positive then
    //Check if n is a power of 2 using n and n-1 then
    //Check if power is not divisible by 3 then power can be for 2&4
    
    //Using recursion
    public boolean isPowerOfFourRec(int n){
        if(n==1)
            return true;
        if(n%4 != 0 || n<1)
            return false;
        return isPowerOfFour(n/4);
    }

    // Write a recursive function for given n and a to determine x:
    //   n = a ^ x 
    //   a = 2, 3, 4
    //   (2 ^ -31) <= n <= (2 ^ 31) - 1  
    
    static int find(int n,int a){
        if(n==1)
            return 0;
        if(n<1 || n%a != 0)
            return Integer.MIN_VALUE;

        int result = find(n/a, a);
        if(result == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return result+1;
    }
}
