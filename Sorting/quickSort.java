import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {6,2,6,5,1,2};
        quickSortt(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr);
    }

    static void quickSortt(int[] arr,int low,int high){
        //low and high tell the part of array we are working on
        //s and e are used for particular elements and their swapping
        
        if(low>=high){
            return;
        }
        int s = low , e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            //also a reason why if its already sorted it wont swap
            while(arr[s]<pivot)
                s++;
            while(arr[e]>pivot)
                e--;    
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;e--;
            }
        }

        //now pivot is at the correct position so sort the two halves
        quickSortt(arr,low,e);
        quickSortt(arr,s,high);

    }
}
