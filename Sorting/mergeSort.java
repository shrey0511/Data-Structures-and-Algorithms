import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0,-9,-90};
        System.out.println(Arrays.toString(mergeeSort(arr)));
    }
    static int[] mergeeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left,int[] right){
        int[] mix =  new int[left.length+right.length];

        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
