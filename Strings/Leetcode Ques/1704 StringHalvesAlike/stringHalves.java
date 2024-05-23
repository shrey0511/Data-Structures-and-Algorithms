//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

import java.util.HashSet;
import java.util.Set;

public class stringHalves {
    public static void main(String[] args) {
        String s = "textbook";
        if(halvesAreAlike(s))
            System.out.println("True");
        else{
            System.out.println("False");
        }    
    }
    static boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');
        vowels.add('A');vowels.add('E');vowels.add('I');vowels.add('O');vowels.add('U');
        int length = s.length();
        int midPoint = length/2;
        String firstHalf = s.substring(0, midPoint); //.substring is exclusive with end point
        String secondHalf = s.substring(midPoint);
        return countVowels(firstHalf, vowels) == countVowels(secondHalf, vowels);
    }
    static int countVowels(String str, Set<Character> vowels){
        int count = 0;
        for (char c : str.toCharArray()){
            if (vowels.contains(c)){
                count++;
            }
        }
        return count;
    }
}
