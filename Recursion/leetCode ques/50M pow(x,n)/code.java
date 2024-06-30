//https://leetcode.com/problems/powx-n/

public class code {
    public static void main(String[] args) {
        
    }

    static double myPow(double x, int n) {
        if (n == 0) return 1;
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            if (n > 0) {
                return x * half * half;
            } else {
                return (1 / x) * half * half;
            }
        }
    }
}
