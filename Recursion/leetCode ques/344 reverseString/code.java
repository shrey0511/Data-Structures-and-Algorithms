//https://leetcode.com/problems/reverse-string/

public class code {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }

    static void reverseString(char[] s) {
        int n = s.length-1;
        helper(s,n,0);
    }

    private static void helper(char[] s , int end , int start){
        if(start>=end) return;
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        helper(s,end-1,start+1);
    }
}
