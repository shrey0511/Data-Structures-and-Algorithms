//https://leetcode.com/problems/assign-cookies/description/

public class code {
    public static void main(String[] args) {
        
    }
    static int findContentChildren(int[] g, int[] s) {
        int i = 0, j = 0;
        quickSortt(g,0,g.length-1);
        quickSortt(s,0,s.length-1);
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i;
    }
    static void quickSortt(int[] arr,int low,int high){
        if(low>=high) return;
        int start = low , end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while(start<=end){
            while(arr[start]<pivot)
                start++;
            while(arr[end]>pivot)
                end--;
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;end--;
            }    
        }
        quickSortt(arr,low,end);
        quickSortt(arr,start,high);
    }
}
