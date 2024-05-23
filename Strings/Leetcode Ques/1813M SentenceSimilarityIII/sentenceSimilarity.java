//https://leetcode.com/problems/sentence-similarity-iii/description/

public class sentenceSimilarity {
    public static void main(String[] args) {
        
    }
    static boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        int len1 = words1.length , len2 = words2.length;
        if(len1 > len2)
            return areSentencesSimilar(sentence2,sentence1);
        
        int i = 0 ;
        while(i<len1 && words1[i].equals(words2[i])){
            ++i;
        }
        //find numbers of word matching from end
        while(i < len1 && words1[i].equals(words2[len2 - (len1 - i)])){
            ++i;
        }
        
        return i == len1;
        
    }
}
