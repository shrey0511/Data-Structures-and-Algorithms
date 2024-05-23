//https://leetcode.com/problems/largest-number/description/

import java.util.Arrays;

public class largest {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums)) ;
    }
    static String largestNumber(int[] nums) {
        String[] list = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            list[i] = String.valueOf(nums[i]);
        }
        // Arrays.sort(list, new Comparator<String>() {
        //     @Override
        //     public int compare(String s1, String s2){
        //         return (s2 + s1).compareTo(s1 + s2);
        //     }
        // });
        Arrays.sort(list,(a,b)->(b+a).compareTo(a+b));
        if(list[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for(String s : list) {
            sb.append(s);
        }
        return sb.toString();
    }
}
