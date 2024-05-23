//https://leetcode.com/problems/next-greater-element-iii/

public class code {
    public static void main(String[] args) {
        System.out.println(nextGreaterElementIII(123));
    }
    static int nextGreaterElementIII(int n){
        char[] arr = Integer.toString(n).toCharArray();
        int i = arr.length-2;//2nd last letter
        int k = arr.length-1;//last letter
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i==-1)
            return -1;
        while(arr[k]<=arr[i]){
            k--;
        }
        swap(arr,i,k);
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j<=i ;  j++){
            sb.append(arr[j]);
        }
        for(int j = arr.length-1; j>i ;  j--){
            sb.append(arr[j]);
        }
        long ans = Long.parseLong(sb.toString());
        return (ans>Integer.MAX_VALUE) ? -1:(int) ans;
    }
    static void swap(int[] arr,int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
