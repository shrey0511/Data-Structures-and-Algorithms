//https://www.geeksforgeeks.org/recursive-bubble-sort/

public class code {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        printArray(arr);
        recBubbleSort(arr,0);
    }

    //In bubble sort after each pass, the largest element comes at the end
    
    //Iterative approac
    static void bubbleSort(int[] arr){
        printArray(arr);
        System.out.println();
        for(int i=0 ; i<arr.length-1 ; i++){
            //Last i elements are already in place
            for(int j = i+1 ; j<arr.length-i-1 ; j++){
                if(arr[i] > arr[j])
                    swap(arr , i , j);
            }
        }
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i=0;i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }    
        System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;    
    }

    //Recursive approach
    static void recBubbleSort(int[] arr,int i){
        if(i == arr.length-1){
            printArray(arr);
            return;
        }

        for(int j = 0;j<arr.length-i-1;j++){
            if(arr[j] > arr[j+1]){
                swap(arr, j, j+1);
            }
        }
        recBubbleSort(arr, i+1);
    }
}
