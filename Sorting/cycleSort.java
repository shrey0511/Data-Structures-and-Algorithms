import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {2,2,3,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        //TODO Whats wrong in the for loop part
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==arr[arr[i]-1]){
        //         continue;
        //     }
        //     else{
        //         swap(arr,i,arr[i]-1);
        //     }
        // }
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
