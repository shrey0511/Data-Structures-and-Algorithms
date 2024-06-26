//https://www.geeksforgeeks.org/recursive-program-prime-number/

public class code {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrime(n,2));
    }

    private static boolean isPrime(int n , int i) {
        if(n <= 2){
            return (n==2)? true : false;
        }
        if(n % i == 0)
            return false;

        if(n < i*i)
            return true;

        return isPrime(n, i+1);
    }
}
