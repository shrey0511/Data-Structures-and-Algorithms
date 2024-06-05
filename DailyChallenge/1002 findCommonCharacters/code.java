//https://leetcode.com/problems/find-common-characters/description/?envType=daily-question&envId=2024-06-05

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    static List<String> commonChars(String[] words){
        int[] last = count(words[0]);
        //Counts the occurence of each character

        for(int i=1;i<words.length;i++){
            last = intersection(last, count(words[i]));
        }
        //takes the minimum of occurence of characters in all the words

        List<String> res = new ArrayList<>();
        for(int i=0;i<26;i++){
            if(last[i]!=0){
                char c = (char) (i + 'a');//Converts the char into original value
                String s = String.valueOf(c);//Converts into a string
                while(last[i]!=0){//Adds the string the minimum no. of times
                    res.add(s);
                    last[i]--;
                }
            }
        }
        return res;
    }

    static int[] count(String word){
        int[] arr = new int[26];
        
        for(char c : word.toCharArray()){
            arr[c-'a']++;//To store the char in smaller indices of array
        }

        return arr;
    }

    static int[] intersection(int[] a , int[] b){
        int[] arr = new int[26];
        for(int i=0;i<26;i++){//To store the minimum no. of occurence of a char
            arr[i] = Math.min(a[i],b[i]);
        }
        return arr;
    }
}
