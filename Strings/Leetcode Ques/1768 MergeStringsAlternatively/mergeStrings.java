//https://leetcode.com/problems/merge-strings-alternately/description/

public class mergeStrings {
    public static void main(String[] args) {
        String s = "ab" , t = "xyz";
        System.out.println(mergeAlternately(s, t));
    }
    static String mergeAlternately(String word1, String word2) {
        int minlength = Math.min(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();
        for(int i=0;i<minlength;++i){
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        result.append(word1.substring(minlength)).append(word2.substring(minlength));
        return result.toString();
    }
}
