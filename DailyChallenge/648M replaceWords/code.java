//https://leetcode.com/problems/replace-words/?envType=daily-question&envId=2024-06-07

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    static String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>(dictionary);
        List<String> temp = new ArrayList<>(Arrays.asList(sentence.split(" ")));
    
        StringBuilder res = new StringBuilder();
        for(String word : temp){
            int i = 0;
            while(i <= word.length()){
                String curr = word.substring(0,i);
                if(set.contains(curr)){
                    res.append(curr).append(" ");
                    break;
                }
                i++;
            }
            if(i == word.length() + 1){
                res.append(word).append(" ");   
            }
            
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
