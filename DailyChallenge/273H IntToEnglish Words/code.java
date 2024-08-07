//https://leetcode.com/problems/integer-to-english-words/?envType=daily-question&envId=2024-08-07

public class code {
    public static void main(String[] args) {
        
    }

    private String[] belowTwenty = {"","One","Two","Three","Four","Five","Six",
        "Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen",
        "Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

    private String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy",
        "Eighty" , "Ninety"};

    public String numberToWords(int num) {
        if(num == 0)
            return "Zero";

        return helper(num);
    }

    public String helper(int num){
        StringBuilder sb = new StringBuilder();

        if(num<20){
            sb.append(belowTwenty[num]);
        }else if(num<100){
            sb.append(tens[num/10]+ " " + helper(num%10));
        }else if(num < 1000){
            sb.append(helper(num/100) + " Hundred " + helper(num%100));
        }else if(num < 1000000){
            sb.append(helper(num/1000) + " Thousand " + helper(num%1000));
        }else if(num < 1000000000){
            sb.append(helper(num/1000000) + " Million " + helper(num%1000000));
        }else{
            sb.append(helper(num/1000000000) + " Billion " + helper(num%1000000000));  
        }

        return sb.toString().trim();
    }
}
