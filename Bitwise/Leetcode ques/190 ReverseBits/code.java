//https://leetcode.com/problems/reverse-bits/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int reverseBits(int num) {
        
        num = (((num & 0xffff0000)>>>16) | ((num & 0x0000ffff)<<16));
        num = (((num & 0xff00ff00)>>>8) | ((num & 0x00ff00ff)<<8));
        num = (((num & 0xf0f0f0f0)>>>4) | ((num & 0x0f0f0f0f)<<4));
        num = (((num & 0xcccccccc)>>>2) | ((num & 0x33333333)<<2));
        num = (((num & 0xaaaaaaaa)>>>1) | ((num & 0x55555555)<<1));

        return num;
    }
    //mirrors are used to get the desired values like
    //f = 1111 , ff00 = 1111 1111 0000 0000 , f0 = 1111 0000 , c = 1100 , 3 = 0011
    //a = 1010 , 5 = 0101 accordingly these are used to get the values and then
    // using OR(|) join both the halves  
}
