//Amazon Question

public class missingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            //We need to find first positive so ignore negatives and zero
            if(arr[i]>0&&arr[i]<=arr.length&&arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
                return i+1;
        }
        //If all nos. from 1 to N are sorted then answer is this
        return arr.length+1;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
