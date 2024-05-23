//https://leetcode.com/problems/basic-calculator-ii/description/

public class calculatorII {
    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s));
    }
    static int calculate(String s){
        int num = 0 , last = 0 , sum = 0;
        char op = '+';

        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                num = num*10 + (c-'0');
            }
            if(isOperator(c)||c==s.length()-1){
                if(op=='+'){
                    sum += last ;
                    last = num;
                }else if(op=='-'){
                    sum += last;
                    last = -num;
                }else if(op == '*'){
                    last *= num;
                }else if(op == '/'){
                    last /= num;
                }
                num = 0 ; op = c;
            }
        }
        return sum += last ;
    }
    static boolean isOperator(char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
