public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,7,11,15,20};
        System.out.println(checkCeiling(arr, 6));
    }

    static int checkCeiling(int[] arr,int target){
        int start=0,end=arr.length-1;
        //int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>arr[arr.length-1]){
                return -1;
            }
            

            if(arr[mid]>target){
                end=mid-1;
                //ans=arr[mid];
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]==target){
                // ans=arr[mid];
                // return ans;
                return mid;
            }
            
        }
        return start;    
    }
}    
// In the case of floor just return end as it wants greatest no. <= target
