// Google Question
//List is used as the answer has variable length
//Works in leetcode

import java.util.ArrayList;
import java.util.List;

public class code {
    // public static void main(String[] args) {
    //     int[] arr = {4,3,2,7,8,2,3,1};
    //     System.out.println(findDisappearedNumbers(arr));
    // }
    static List<Integer> findDisappearedNumbers(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList();
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1)
                ans.add(i+1);
        }
        return ans;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
}
