import java.util.Arrays;
import java.util.HashMap;

public class code {
    public static void main(String[] args) {
        
    }

    //O(NlogN)
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();

        for(int i = 0 ; i<heights.length ; i++){
            map.put(heights[i] , names[i]);
        }
        Arrays.sort(heights);//nlogn

        int i = 0;
        for(int j = heights.length-1 ; j>=0 ; j--){
            names[i++] = map.get(heights[j]);
        }
        return names;
    }

    //O(N^2)
    public String[] sortPeopleBrute(String[] names, int[] heights) {
        int currTallest = 0;
        for(int i = 0 ; i<names.length ; i++){
            currTallest = findTallestIndex(heights , i , names.length-1);
            swap(heights , i , currTallest);
            swap(names , i , currTallest);
        }
        return names;
    }

    private int findTallestIndex(int[] arr , int start , int end){
        int max = start;
        for(int i = start+1 ; i<=end ; i++){
            if(arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    private void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void swap(String[] arr , int i , int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
