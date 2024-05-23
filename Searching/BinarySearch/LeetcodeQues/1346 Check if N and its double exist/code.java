

public class code {
    public static void main(String[] args) {
        
    }   
    
    static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int index=search(arr,arr[i]*2);
            if(index>=0 && i!=index){
                return true;
            }
        }
        return false;
    }
    static int search(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
