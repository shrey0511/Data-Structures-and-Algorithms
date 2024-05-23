//https://leetcode.com/problems/sort-array-by-parity-ii/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int[] sortArrayByParityII(int[] nums) {
        quickSortt(nums,0,1);
        return nums;
    }
    static void quickSortt(int[] arr,int start,int end){
        if(arr.length==1||arr.length==0)
            return;
        while(true){
            while(start<arr.length&&arr[start]%2==0)
                start+=2;
            while(end<arr.length&&arr[end]%2!=0)
                end+=2;   
            if(end>=arr.length || start>=arr.length)
                return;        
            
            swap(arr,start,end);     
        }    
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
