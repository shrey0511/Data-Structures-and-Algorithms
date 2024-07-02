import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        //permutationss("", "abc");
        ArrayList<String> ans = permutationsList("", "aab");
        System.out.println(ans);

    }

    //Here the number of recursion calls depends on the processed letters
    //Size of processed + 1
    static void permutationss(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        //As we need variable no. of recursive calls since we need to form all combinations
        //of current processed letters so we need a loop running processed.length + 1 times
        for(int i = 0 ; i<= p.length() ; i++){//like for ab we use 3 positions
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permutationss(f+ch+s, up.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
    
        //Local to this call
        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
    
        //As we need variable no. of recursive calls since we need to form all combinations
        //of current processed letters so we need a loop running processed.length + 1 times
        for(int i = 0 ; i<= p.length() ; i++){//like for ab we use 3 positions
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    static int permutationsCount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        //As we need variable no. of recursive calls since we need to form all combinations
        //of current processed letters so we need a loop running processed.length + 1 times
        for(int i = 0 ; i<= p.length() ; i++){//like for ab we use 3 positions
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f+ch+s, up.substring(1));
        }
        return count;
    }
}
