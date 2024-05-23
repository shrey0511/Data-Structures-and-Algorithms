import java.util.ArrayList;
import java.util.List;

public class allDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,5,6,3};
        System.out.println(findAllDuplicates(arr));
        
    }  
    static List<Integer> findAllDuplicates(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            //Now check if the correct position already has the correct value or not
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }   
        }
        return ans;
    }  
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
