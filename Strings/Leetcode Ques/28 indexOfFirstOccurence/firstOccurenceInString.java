//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class firstOccurenceInString {
    public static void main(String[] args) {
        
    }
    static int strStr(String haystack, String needle) { 
        int length = haystack.length() - needle.length(); 
        int j = 0;
        boolean found = false;
        for(int i = 0; i <= length && !found; i++){
            if(haystack.substring(0+j, needle.length()+j).equals(needle)){
                found = true;
                return i;
            }
            else{
                j++;
            }
        }
        return -1;
     }
}
