//https://leetcode.com/problems/largest-perimeter-triangle/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int largestPerimeter(int[] nums) {
        quickSortt(nums,0,nums.length-1);
        int i=nums.length-1;
        while(i>=2){
            if(nums[i]<nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
            i--;
        }
        return 0;
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
