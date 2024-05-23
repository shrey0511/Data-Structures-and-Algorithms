import java.util.Arrays;

public class SearchWithStrings {
    public static void main(String[] args) {
        String s = "i am your son";
        char target = 'o';
        System.out.println(Search(s, target));
        System.out.println(Arrays.toString(s.toCharArray()));
    }
    static boolean Search(String x,char target){
        if(x.length()==0)
            return false;

        // for(char element : x.toCharArray()){
        //     if(element==target)
        //         return true;
        // }
        for(int i=0;i<x.length();i++){
            if(target==x.charAt(i))
                return true;
        }
        return false;
    }
}
