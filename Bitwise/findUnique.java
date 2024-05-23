public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,6,4,3};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;

        for(int n : arr){
            unique = unique^n;
            //XOR all the numbers , same ones will cancel each other out
        }

        return unique;
    }
    
}
