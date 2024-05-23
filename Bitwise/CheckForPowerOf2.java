public class CheckForPowerOf2 {
    public static void main(String[] args) {
        int n = 8;
        //fix for 0
        if(n==0){
            System.out.println(false);
            return; 
        }
        boolean ans = (n & (n-1)) == 0; 
        // Concept behind this is that any number in power of two like 8 = 1000,
        // can be written as, 1000 = 111 + 1 where 111 = n-1 i.e 7,
        // so when we use '&' with 8 and 7, we get 0 and not 0 with a no.,
        //not a power of two like with 10 (1010)
        System.out.println(ans);
    }
}
