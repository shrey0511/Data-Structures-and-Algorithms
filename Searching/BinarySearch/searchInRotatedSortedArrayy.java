//Without duplicates Q33 in leetcode

public class searchInRotatedSortedArrayy {
    public static void main(String[] args) {
        int[] nums = {5,6,7,2,3,4};
        int peak = peakSearch(nums);
        int firstTry = binarySearch(nums, 3, 0, peak+1);
        if(firstTry!=-1)
            System.out.println(firstTry);
        else    
            System.out.println(binarySearch(nums, 3, peak+1, nums.length-1));    
    }
    
// For array having duplicates code is different have a look at the video again
    static int peakSearch(int[] arr){
        int start = 0,end = arr.length-1,count=0;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid>start&&arr[mid]>arr[mid+1]){
                count=mid+1;
                System.out.println("No. of rotations = "+count);
                return mid;
            }
            if(mid<end&&arr[mid]<arr[mid-1]){
                count = mid-1+1;
                System.out.println("No. of rotations = "+count);
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){

            int mid= start + (end-start)/2; //To keep int mid in range of integer while adding start and end
            
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;    
    }
}
