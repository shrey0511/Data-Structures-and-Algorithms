import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {-12,22,0,-5,14};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = findMaxIndex(arr,0,last);
            //swap
            swap(arr, last, maxIndex);
        }
    }
    static int findMaxIndex(int[] arr,int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
