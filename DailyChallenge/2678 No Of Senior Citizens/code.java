//https://leetcode.com/problems/number-of-senior-citizens/?envType=daily-question&envId=2024-08-01

public class code {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0 ; i<details.length ; i++){
            String word = details[i];
            details[i] = word.substring(word.length()-4,word.length()-2);
        }

        for(String word : details){
            if(word.charAt(0) - '0' > 6){
                count++;
            }else if(word.charAt(0) - '0' == 6){
                if(word.charAt(1) - '0' > 0)
                    count++;
            }else{
                continue;
            }
        }

        return count;
    }
}
