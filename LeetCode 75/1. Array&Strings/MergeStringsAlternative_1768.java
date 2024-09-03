//https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75

public class MergeStringsAlternative_1768 {
    public static void main(String[] args) {
        
    }

    static String mergeAlternately(String word1, String word2) {
        int ptr1 = 0 , ptr2 = 0;
        boolean turn = true;
        StringBuilder sb = new StringBuilder();

        while(ptr1 < word1.length() && ptr2 < word2.length()){
            if(turn){
                sb.append(word1.charAt(ptr1++));
                turn = false;
            }
            else{
                sb.append(word2.charAt(ptr2++));
                turn = true;
            }
        }

        if(ptr1 < word1.length()){
            sb.append(word1.substring(ptr1));
        }
        if(ptr2 < word2.length()){
            sb.append(word2.substring(ptr2));
        }

        return sb.toString();
    }
}
