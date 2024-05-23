package Searching;

public class Linear {
    public static void main(String[] args) {
        int[] nums = {2,5,6,8,9};
        int target = 0;
        int location = linearSearch(nums, target);
        System.out.println(location);
    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0)
            return -1;
        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element==target)
                return index; 
        }
        return -1;    
    }
}
