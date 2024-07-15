//https://leetcode.com/problems/number-of-atoms/?envType=daily-question&envId=2024-07-14

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class code {
    public static void main(String[] args) {
        
    }

    static String countOfAtoms(String formula) {
        Map<String,Integer> countAtoms = parseFormula(formula);

        //To store atoms according to their names we use TreeMap
        TreeMap<String,Integer> sortedCount = new TreeMap<>(countAtoms);

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry : sortedCount.entrySet()){
            sb.append(entry.getKey());
            if(entry.getValue() > 1){
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }

    static Map<String,Integer> parseFormula(String formula) {
        Stack<Map<String,Integer>> st = new Stack<>();
        Map<String,Integer> currMap = new HashMap<>();

        int i = 0;
        while(i<formula.length()){
            char c = formula.charAt(i);
            if(c == '('){
                st.push(currMap);
                currMap = new HashMap<>();
                i++;
            }else if(c == ')'){
                int j = i+1;
                int num = 0;
                while(j < formula.length() && Character.isDigit(formula.charAt(j))){
                    num = num*10 + formula.charAt(j)-'0';
                    j++;
                }
                num = (num == 0) ? 1 : num;

                if(!st.isEmpty()){
                    Map<String,Integer> tempMap = currMap;
                    currMap = st.pop();
                    for(String key : tempMap.keySet()){
                        currMap.put(key , currMap.getOrDefault(key, 0) + tempMap.get(key) * num);
                    }
                }
                i=j;
            }else{//just alphabets
                int j = i + 1;
                while( j < formula.length() && Character.isLowerCase(formula.charAt(j))){
                    j++;
                }
                String atom = formula.substring(i, j);
                i = j;
                int num = 0;
                while(i<formula.length() && Character.isDigit(formula.charAt(i))){
                    num = num * 10 + formula.charAt(i) - '0';
                    i++;
                }
                num = (num == 0)? 1 : num;
                currMap.put(atom , currMap.getOrDefault(atom, 0) + num);
            }
        }

        return currMap;
    }
}
