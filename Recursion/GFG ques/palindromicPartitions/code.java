//https://www.geeksforgeeks.org/given-a-string-print-all-possible-palindromic-partition/

import java.util.ArrayList;

public class code {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> res =  new ArrayList<>();
        String x = "nitin";
        int index = 0;
        ArrayList<String> curr = new ArrayList<>();
        code obj = new code();
        obj.partition(res, x, index, curr);
        for(ArrayList<String> list : res){
            System.out.println(list);
        }
    }

    public void partition(ArrayList<ArrayList<String>> res , String s , int index , ArrayList<String> curr){
        
        //Base condition
        if(index == s.length()){
            res.add(new ArrayList<String>(curr));
            return;
        }

        String temp = "";
        for(int i = index ; i<s.length() ; i++){
            temp += s.charAt(i);

            if(isPalindrome(temp)){
                curr.add(temp);

                partition(res, s, index+1, curr);

                curr.remove(curr.size()-1);
            }
        }
    }

    private boolean isPalindrome(String temp) {
        int l = 0 , r = temp.length()-1;
        while(l<r){
            if(temp.charAt(l)!=temp.charAt(r)){
                return false;
            }
            l++;
            r--;
        }    
        return true;
    }
}
