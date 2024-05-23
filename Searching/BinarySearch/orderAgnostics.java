public class orderAgnostics {
    public static void main(String[] args) {
        int[] arr1 = {2,5,7,9,10,15,18};
        int[] arr2 = {11,10,9,8,6,4,3,2,1,0};
        System.out.println(orderAgnosticsSearch(arr1, 9));
        System.out.println(orderAgnosticsSearch(arr2, 9));
    }
    static int orderAgnosticsSearch(int[] arr,int target){
        int start=0,end = arr.length-1;
        
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
