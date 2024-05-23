//https://leetcode.com/problems/height-checker/description/

public class code {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,6,4};
        System.out.println(heightChecker(arr));
    }
    static int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        quickSortt(expected,0,expected.length-1);
        int i = 0; 
        int correct = expected[i];
        int count=0;
        while(i<heights.length){
            if(heights[i]!=correct)
                count++;
            i++;    
        }
        return count;
    }
    static void quickSortt(int[] arr,int low,int high){
        if(low>=high) return;
        int start = low , end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;end--;
            }
        }
        quickSortt(arr,low,end);
        quickSortt(arr,start,high);
    }
}
