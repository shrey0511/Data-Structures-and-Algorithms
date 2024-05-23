//https://leetcode.com/problems/valid-palindrome-ii/description/

public class palindromeTwo {
    public static void main(String[] args) {
        
    }
    static boolean validPalindrome(String s) {
        int start = 0 , end = s.length()-1;
        while(start<=end){
            char c1 = s.charAt(start) , c2 = s.charAt(end);
            if(c1==c2){
                start++;end--;
            }else return isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1);
        }
        return true;
    }
    static boolean isPalindrome(String s , int i , int j){
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
