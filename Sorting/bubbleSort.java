import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,-5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped = false;
        //run the loop for n-1 times
        for(int i=0;i<arr.length;i++){
            //for each step the maximum element will come at the last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap the item smaller than the previous item
                if(arr[j]<arr[j-1]){
                    // swap
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            //if for any respective i no elements were swapped then array is sorted break the loop
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
