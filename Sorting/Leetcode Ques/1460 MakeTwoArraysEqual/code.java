//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/description/

public class code {
    public static void main(String[] args) {
        
    }
    //Count sort
    static boolean canBeEqual(int[] target, int[] arr) {
        int feq[]=new int[1001];
         for(int i:target){
             feq[i]++;
         }
         for(int i:arr){
             feq[i]--;  
         }
         for(int element:feq){
             if(element!=0){
                 return false;
             }
         }
         return true;
     }
}
