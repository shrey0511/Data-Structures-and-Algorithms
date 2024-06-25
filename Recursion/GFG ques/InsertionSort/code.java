//https://www.geeksforgeeks.org/recursive-insertion-sort/

public class code {
    public static void main(String[] args) {
        int[] arr = {5,2,1,3,4};
        printArray(arr);
        insertionSort(arr, arr.length);
        printArray(arr);
    }

    //This sort picks up individual element and place it to it's respective postition
    //A secure sorting order i.e even equal elements maintain their relatie order
    
    //Recursive approach
    static void insertionSort(int[] arr, int n){
        if(n <= 1)
            return;

        insertionSort(arr, n-1);

        int last = arr[n-1];
        int j = n-2;//Element before the last to compare

        while(j>=0 && arr[j]>last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    private static void printArray(int[] arr) {
        for(int i=0;i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }    
        System.out.println();
    }

    //Iterative approach
    static void insertion(int[] arr){
        for(int i = 1 ; i<arr.length ; i++){
            int key = arr[i];

            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

}
