public class basicCode {
    public static void main(String[] args) {
        int[] arr = {-8,-1,0,5,8,10,15,20,66,90};
        System.out.println(binarySearch(arr, 20));
    }

    static int binarySearch(int[] arr,int target){

        int start=0,end=arr.length-1;

        //If we dont know whether array is in ascending or descending just check first and last element
        //and do some minor changes
        
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