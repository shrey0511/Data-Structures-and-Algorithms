//https://www.geeksforgeeks.org/sum-digit-number-using-recursion/

public class code {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumDigits(n));
    }

    static int sumDigits(int n){
        if(n%10 == n)
            return n;

        int digit = n%10;
        return digit + sumDigits(n/10);
    }
}
