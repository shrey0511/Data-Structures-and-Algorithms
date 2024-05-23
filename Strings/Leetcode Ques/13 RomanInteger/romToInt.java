//https://leetcode.com/problems/roman-to-integer/

public class romToInt {
    public static void main(String[] args) {
        
    }
    static int romanToInt(String s) {
        int ans = 0 , i=0;
        while(i<s.length()){
            if(i<s.length()-1 && value(s.charAt(i))<value(s.charAt(i+1)))
                ans-=value(s.charAt(i));
            else{
                ans+=value(s.charAt(i));
            }
            i++;
        }
        return ans;
    }
    static int value(char x){
        if(x=='I')
            return 1;
        if(x=='V')
            return 5;
        if(x=='X')
            return 10;
        if(x=='L')
            return 50;
        if(x=='C')
            return 100;
        if(x=='D')
            return 500;
        if(x=='M')
            return 1000;
        return -1;
    }
}
