//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

public class code {
    public static void main(String[] args) {
        int[] arr = {1,4,45,6,10,-8};
        //find(arr,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        System.out.println(findMin(arr, arr.length));
    }

    private static int findMin(int[] arr , int n){
        if(n == 1)
            return arr[0];

        return Math.min(arr[n-1],findMin(arr, n-1));
    }

    private static void find(int[] arr,int i, int min, int max) {
        if(i == arr.length)
            System.out.println("min = "+min+" max = "+max);

        if(arr[i] < min)
            min = arr[i];
        if(arr[i] > max)
            max = arr[i];

        find(arr, i+1, min, max);

        return;
    }
    
    
}
