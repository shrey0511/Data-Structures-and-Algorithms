//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }
    static int[] sortByBits(int[] arr) {
        //First of all we take bitcount ,add the no. itself and multiply by outside 
        //of constraint to prevent having the same values in our array
        for(int i=0;i<arr.length;i++)
        {
            arr[i]+=Integer.bitCount(arr[i])*10001;
        }
        
        Arrays.sort(arr);

        //After sorting we can use modulus on the nos. to get out number back
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%10001;
        }
        return arr;
    }
}
