//https://leetcode.com/problems/kth-distinct-string-in-an-array/?envType=daily-question&envId=2024-08-05

import java.util.HashMap;

public class code {
    public static void main(String[] args) {
        
    }

    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();

        for(String s : arr){
            map.put(s , map.getOrDefault(s,0)+1);
        }

        for(String s : arr){
            if(map.get(s) == 1){
                k--;
                if(k==0)
                    return s;
            }
        }

        return "";
    }
}
