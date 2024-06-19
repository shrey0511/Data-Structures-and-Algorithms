
//This binary search can be broken down into smaller problems so 1 check
//Form the recurrence relation
//What do we do in binary search, Compare and Divide
//So for comparing we need O(1) and for dividing into half f(N/2)
//Recurrence relation : f(n) = O(1) + f(n/2)

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,55,67,88};
        System.out.println(search(arr, 67, 0, arr.length-1));
    }

    static int search(int[] arr , int target , int start , int end){    
        if(start>end)
            return -1;

        int mid = start + (end-start) / 2 ;
        
        if(arr[mid] == target)
            return mid;

        if(arr[mid]>target)
            return search(arr, target, start, mid-1);

        return search(arr, target, mid+1, end);
    }

}
