//https://leetcode.com/contest/weekly-contest-407/problems/number-of-bit-changes-to-make-two-integers-equal/

public class code1 {
    public static void main(String[] args) {
        
    }

    public int minChanges(int n, int k) {
        if ((k & ~n) != 0) {
            return -1;
        }

        int changes = 0;
        int xor = n ^ k;
        
        while (xor > 0) {
            if ((xor & 1) == 1 && (n & 1) == 1) {
                changes++;
            }
            xor >>= 1;
            n >>= 1;
        }
        
        return changes;
    }
    
}
