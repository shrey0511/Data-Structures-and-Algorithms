//https://leetcode.com/problems/multiply-strings/description/

public class multiplyStrings {
    public static void main(String[] args) {
        String num1 = "123", num2 = "456";
        System.out.println(multiply(num1, num2));
    }
    static String multiply(String num1, String num2) {
        int m = num1.length() , n = num2.length();
        int[] pos = new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int pos1 = i+j , pos2 = i+j+1;
                int sum = mul + pos[pos2];

                pos[pos1] += sum/10;
                pos[pos2] = sum%10; 
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int p : pos) if(!(sb.length()==0 && p==0)) sb.append(p);
        
        return sb.length()==0 ? "0" : sb.toString(); 
    }
}
