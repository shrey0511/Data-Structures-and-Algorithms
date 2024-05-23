//Amazon and Microsoft Question
//Using cycleSort for satisfying the condition of constant space O(1)

public class duplicateFind {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }   
    static int findDuplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            //Firstly check if the element is at the correct position or not
            if(arr[i]!=i+1){
                int correct = arr[i]-1;
                //Now check if the correct position already has the correct value or not
                if(arr[i]!=arr[correct]){
                    swap(arr, i, correct);
                }else{
                    //you found the answer 
                    return arr[i];
                }
            }else{
                i++;
            }    
        }
        return -1;
    } 
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
