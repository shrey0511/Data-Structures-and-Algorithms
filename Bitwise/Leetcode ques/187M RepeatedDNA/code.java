//https://leetcode.com/problems/repeated-dna-sequences/description/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class code {
    public static void main(String[] args) {
        
    }   
    static List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet() ; Set repeated = new HashSet();
        //Set carries only unique elements
        for(int i=0 ; i+9 < s.length() ; i++){
            String ten = s.substring(i,i+10);
            if(!seen.add(ten))
            //If set doesnt add meaning there is already a set present
                repeated.add(ten);//So it is repeated
        }
        return new ArrayList(repeated);
    } 
}
