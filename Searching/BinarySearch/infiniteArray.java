public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,10,12,16,19,22,26,33,44,50,69};
        System.out.println(ans(arr, 22));
    }

    static int ans(int[] arr,int target){
        
        int start = 0,end = 1;
        while(target>arr[end]){
            //Doubling size of array
            int newStart = end + 1;
            end = end + (end-start+1);
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
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
