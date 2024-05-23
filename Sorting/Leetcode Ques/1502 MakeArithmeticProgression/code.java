//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/
//Retry with the optimised one

public class code {
    public static void main(String[] args) {
        
    }
    static boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int element: arr){
            min = Math.min(element,min);
            max = Math.max(element,max);
        }
        if((max-min)%(n-1)!=0)
            return false;

        int diff = (max-min)/(n-1);
        if(diff==0)
            return true;

        boolean[] bucket = new boolean[n];
        for(int element:arr){
            if((element-min)%diff!=0){
                return false;
            }
            int id = (element-min)/diff;
            if(bucket[id]){
                return false;
            }
            bucket[id] = true;
        }    
        return true;
    }
}

//brute force 
// class Solution {
//     public boolean canMakeArithmeticProgression(int[] arr) {
//         Arrays.sort(arr);
//         int diff1 = 0 , diff2=0;
//         for(int i=0;i<arr.length-2;i++){
//             diff1 = arr[i+1]-arr[i];
//             diff2 = arr[i+2]-arr[i+1];
//             if(diff1!=diff2)
//                 return false;
//         }
//         return true;
//     }
// }
