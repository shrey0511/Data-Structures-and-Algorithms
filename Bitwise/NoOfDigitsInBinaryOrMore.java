public class NoOfDigitsInBinaryOrMore {
    public static void main(String[] args) {
        int n = 10;
        int base = 2;
        int digits = (int)(Math.log(n) / Math.log(base)) + 1;
        System.out.println(digits);//Will give 4 as 10 = 1010 in binary
    }
}
