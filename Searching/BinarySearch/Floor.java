public class Floor{
    public static void main(String[] args) {
        int[] arr = {2,5,7,11,15,20};
        System.out.println(checkCeiling(arr, 0));
    }

    static int checkCeiling(int[] arr,int target){
        int start=0,end=arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[0]){
                return -1;
            }
            
            if(arr[mid]>target){
                end=mid-1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]==target){
                return mid;
            }
            
        }
        return end;    
    }
}    
