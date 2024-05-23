//https://leetcode.com/problems/sort-array-by-parity/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int[] sortArrayByParity(int[] nums) {
        quickSortt(nums,0,nums.length-1);
        return nums;
    }
    static void quickSortt(int[] arr,int low,int high){
        //low and high tell the part of array we are working on
        //s and e are used for particular elements and their swapping
        
        if(low>=high){
            return;
        }
        int s = low , e = high;

        while(s<=e){
            //also a reason why if its already sorted it wont swap
            while(arr[s]%2==0&&s<arr.length-1)
                s++;
            while(arr[e]%2!=0&&e>0)
                e--;    
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;e--;
            }
        }
    }
}
