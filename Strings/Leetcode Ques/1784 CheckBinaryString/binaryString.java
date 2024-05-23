//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/

public class binaryString {
    public static void main(String[] args) {
        String s = "110";
        System.out.println(checkOnesSegment(s));
    }
    static boolean checkOnesSegment(String s){
        return !s.contains("01");
    }
}
