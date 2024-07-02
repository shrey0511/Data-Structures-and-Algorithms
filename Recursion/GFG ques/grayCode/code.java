//https://www.geeksforgeeks.org/problems/gray-code-1611215248/1

import java.util.*;

public class code {
    public static void main(String[] args) {
        
    }

    static ArrayList<String> graycode(int n)
    {
        //code here
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ;  i < (1<<n) ; i++){
            int val = i ^ (i>>1);
            String s = "";
            for(int j = 0 ; j < n ; j++){
                if((val & (1<<j)) != 0){
                    s = "1"+s;
                }else{
                    s = "0"+s;
                }
            }
            list.add(s);
        }
        return list;
    }
}
