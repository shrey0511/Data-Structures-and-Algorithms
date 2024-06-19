public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(prodDigits(1234));
    }

    static int sumDigits(int n){
        if(n == 0)
            return 0;

        return (n%10)  + sumDigits(n/10) ; 
    }

    static int prodDigits(int n){
        if(n%10 == n)
            return n;

        return (n%10)  * prodDigits(n/10) ; 
    }
}
