public class setBits {
    public static void main(String[] args) {
        int n = 7 ;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(ans(n));
    }

    private static int ans(int x){
        int count = 0;

        while(x>0){
            count++;
            x = x & (x-1);//everytime a 1 is removed and is counted
        }

        return count;
    }
}
