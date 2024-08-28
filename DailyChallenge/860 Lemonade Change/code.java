//https://leetcode.com/problems/lemonade-change/?envType=daily-question&envId=2024-08-15

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }

    public boolean lemonadeChange(int[] bills) {
        int cntFive = 0 , cntTen = 0;
        List<Integer> list = new ArrayList<>();
        list.
        for(int bill : bills){
            if(bill == 5){
                cntFive++;
            }else if(bill == 10){
                cntTen++;
                if(cntFive == 0)
                    return false;
                cntFive--;
            }else{
                if(cntTen == 0){
                    if(cntFive < 3)
                        return false;
                    else{
                        cntFive -= 3;
                    }
                }
                else if(cntFive == 0)
                    return false;
                else{
                    cntFive--;
                    cntTen--;
                }
            }
        }
        return true;
    }
}
