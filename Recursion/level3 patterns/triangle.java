//Also includes selection and bubble sort using recursion

import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle2(int r , int c){
        if(r == 0)
            return;

        if(c < r){
            triangle2(r, c+1);
            System.out.print("*");
        }else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }

    static void triangle1(int r , int c){
        if(r == 0)
            return;

        if(c < r){
            System.out.print("*");
            triangle1(r, c+1);
        }else{
            System.out.println();
            triangle1(r-1, 0);
        }
    }

    static void bubble(int[] arr, int r, int c){
        if(r == 0)
            return;

        if(c < r){

            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp; 
            }
            bubble(arr,r, c+1);
        }else{
            System.out.println();
            bubble(arr, r-1, 0);
        }
    }

    static void selection(int[] arr,int r , int c,int max){
        if(r == 0)
            return;

        if(c < r){
            if(arr[c]>arr[c+1])
                selection(arr,r, c+1,c);
            else
                selection(arr, r, c+1, max);
        }else{
            int temp =max;
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr,r-1, 0,0);
        }
    }
}
