//https://leetcode.com/problems/relative-sort-array/description/

import java.util.Arrays;
import java.util.HashMap;

public class relativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        int[] res = relativeSort(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
    static int[] relativeSort(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element : arr2){
            map.put(element,0);
        }
        int last = arr1.length-1;
        int[] res = new int[arr1.length];
        for(int element : arr1){
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }else{
                res[last--] = element;
            }
        }
        int p = 0;
        for(int element : arr2){
            int count = map.get(element);
            for(int i=0;i<count;i++){
                res[p++] = element;
            }
        }
        // Arrays.sort(res,p,res.length);
        quickSortt(res, p, res.length-1);
        return res;
    }
    static void quickSortt(int[] arr,int low,int high){
        if(low>=high) return;
        int start = low , end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;end--;
            }
        }
        quickSortt(arr, low, end);
        quickSortt(arr, start, high);
    }
}
