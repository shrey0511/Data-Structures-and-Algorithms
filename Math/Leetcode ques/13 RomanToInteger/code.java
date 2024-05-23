//https://leetcode.com/problems/roman-to-integer/description/

public class code {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
    static int romanToInt(String s) {
        int i=0 , ans=0;
        while(i<s.length()){
            if(i<s.length()-1&& value(s.charAt(i))<value(s.charAt(i+1))){
                ans-=value(s.charAt(i));
            }else{
                ans+=value(s.charAt(i));
            }
            i++;
        }
        return ans;
    }
    static int value(char c){
        if(c=='I')
            return 1;
        if(c=='V')
            return 5;
        if(c=='X')
            return 10;
        if(c=='L')
            return 50;
        if(c=='C')
            return 100;
        if(c=='D')
            return 500;
        if(c=='M')
            return 1000;
        return -1;
    }
}
