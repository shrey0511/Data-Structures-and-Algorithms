import java.util.ArrayList;
import java.util.List;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static boolean find(int[] arr,int target,int index){
        if(index == arr.length)
            return false;
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findIndex(int[] arr,int target,int index){
        if(index == arr.length)
            return -1;

        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }
    static int findIndexFromLast(int[] arr,int target,int index){
        if(index == -1)
            return -1;

        if(arr[index] == target)
            return index;
        else{
            return findIndex(arr, target, index-1);
        }
    }

    //static List<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length)
            return list;

        if(arr[index] == target){
            list.add(index);//For each call, adds the index to the same list but with diff. referecne variable
        }
        return findAllIndex(arr, target, index+1,list);
    }

    //Without using list as a parameter and passing the answers to above calls
    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length)
            return list;

        
        if(arr[index] == target){
            list.add(index);//This will add the index for the current function call only
        }
        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
