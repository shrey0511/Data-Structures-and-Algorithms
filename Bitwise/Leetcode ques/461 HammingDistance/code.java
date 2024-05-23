//https://leetcode.com/problems/hamming-distance/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int hammingDistance(int x, int y) {
        int value = x^y; //Gives you 1 wherever different values
        int count = 0;
        //Now counting those ones
        while(value>0){
            count++;
            value = value & (value-1);
        }
        return count;
    }
}
