//https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

import java.util.List;

public class secondLargest {
    public static void main(String[] args) {
        
    }

    static int print2largest(List<Integer> arr) {
        // Code Here
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int n = arr.size();
        
        for(int i = 0 ; i<n ; i++){
            if(arr.get(i) > max1){
                max2 = max1;
                max1 = arr.get(i);
            }else if(arr.get(i) > max2 && arr.get(i) != max1){
                max2 = arr.get(i);
            }
        }
        return max2 == Integer.MIN_VALUE ? -1 : max2;
    }
}
