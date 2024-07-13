
public class largestElementArray {
    public static void main(String[] args) {
        
    }

    static int largest(int n, int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        
        return helper(n-1 , arr , max);
    }
    
    public static int helper(int n , int[] arr , int max){
        if(n == -1){
            return max;
        }
        if(arr[n]>max)
            max = arr[n];
    
        max = helper(n-1 , arr, max);
        
        return max;
    }
}
