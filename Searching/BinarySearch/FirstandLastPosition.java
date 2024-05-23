//Q34 of leetcode

public class FirstandLastPosition {
    public static void main(String[] args) {
        
    }
    static int[] searchRange(int[] arr,int target){
        int first=search(arr, target, true);
        int last=search(arr, target, false);
        return new int[]{first,last};
    }
    static int search(int[] arr,int target,boolean findFirstPosition){
        int ans = -1;
        int start = 0,end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid + 1;
            }
            else if(arr[mid]>target){
                end = mid - 1;
            }else{
                ans = mid;
                if(findFirstPosition){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
