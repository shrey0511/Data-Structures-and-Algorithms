//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/

public class substrings {
    public static void main(String[] args) {
        
    }
    static int numOfStrings(String[] patterns,String word){
        int count = 0;
        for(String s : patterns){
            if(word.indexOf(s)!=-1)
                count++;
        }
        return count;
    }
}
//Below one gives an error in one of the testcases
    // class Solution {
//     public int numOfStrings(String[] patterns, String word) {
//         int count = 0 ;
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<patterns.length;i++){
//             int length = patterns[i].length();
//             int indexP = 0 , indexW = 0;
//             boolean flag = false;
//             while(indexP<length && indexW<word.length()){
//                 if((patterns[i].charAt(indexP))==(word.charAt(indexW))){
//                     indexP++;indexW++;
//                     flag=true;
//                 }
//                 else{
//                     flag=false;
//                     indexW++;
//                 }
//             }
//             if(flag) 
//                 count++;
//         }
//         return count;
//     }
// }

    
