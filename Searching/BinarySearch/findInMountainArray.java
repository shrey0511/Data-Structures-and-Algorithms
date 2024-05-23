public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,3,2};
        System.out.println(search(arr, 2));
    }
    static int search(int[] arr,int target){
        int peak = peakSearch(arr);
        int firstTry = orderAgnosticsSearch(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticsSearch(arr, target, peak+1, arr.length-1);
    }

    static int peakSearch(int[] arr){

        int start = 0,end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticsSearch(int[] arr,int target,int start,int end){
        
        boolean isAsc = arr[end] > arr[start];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid]>target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
