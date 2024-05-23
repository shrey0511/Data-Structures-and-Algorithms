//https://leetcode.com/problems/count-the-number-of-consistent-strings/description/

//Revisit
public class code {
    public static void main(String[] args) {
        
    }
    static int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        int bitset = 0;
        for(char c : allowed.toCharArray()){
            bitset |= 1 << c - 'a';
        }
        for(String word : words){
            for(char c : word.toCharArray()){
                if((bitset & (1 << c - 'a'))==0){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
