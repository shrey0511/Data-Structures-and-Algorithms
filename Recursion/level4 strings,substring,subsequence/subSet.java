
import java.util.ArrayList;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>>  ans  = subSett(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subSett(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for(int i =0 ; i<n ; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    //Time complexity : O(n * 2^n)  Space: O(2^n * n) -> Space taken by each subset and total subsets
    //Draw the tree of this code using pen & paper to understand it better


    //Have a look at this again using chatGPT
    static List<List<Integer>> subSettDuplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0 , end = 0;

        for(int i =0 ; i<arr.length ; i++){
            start = 0;
            //If current and prev element are same
            if(i>0 && arr[i]==arr[i-1]){
                start = end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j =0 ; j<n ; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
