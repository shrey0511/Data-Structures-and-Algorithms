//https://leetcode.com/problems/group-anagrams/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class code {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }   
    static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map = new HashMap<>();
        for(String word : strs){
            char[] store = word.toCharArray();
            Arrays.sort(store);
            String sortedWord = new String(store);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    } 
}
