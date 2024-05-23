//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

public class reverseWords {
    public static void main(String[] args) {
        
    }
    static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0 , end = 0;
        while(start<arr.length){
            while(end<arr.length && arr[end]!=' '){
            end++;
            }
            reverse(arr,start,end-1);
            start = end + 1;
            end++;
        }
        return new String(arr);
    }

    static void reverse(char[] arr,int left,int right){
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
//Less optimized
// class Solution {
//     public String reverseWords(String s) {
//         String[] words = s.split("\\s+");
        // To split a string by space, use \\s+ . It 
        // will split the string by single or multiple 
        // whitespace characters such as space, tab, etc.
//         StringBuilder sb = new StringBuilder();
//         for(String word:words){
//             StringBuilder reversedWord = new StringBuilder(word);
//             reversedWord.reverse();
//             sb.append(reversedWord).append(" ");
//         }
//         return sb.toString().trim();
//     }
//}

