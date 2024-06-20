import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        
    }   
    
    static void subseqq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqq(p+ch, up.substring(1));//Using the character
        subseqq(p, up.substring(1));//Not using the character
    }

    //If we want to return it as an ArrayList
    static ArrayList<String> subseqList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqList(p+ch, up.substring(1));//Using the character
        ArrayList<String> right = subseqList(p, up.substring(1));//Not using the character

        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqq(p+ch, up.substring(1));//Using the character
        subseqq(p, up.substring(1));//Not using the character
        subseqq(p+(ch+0), up.substring(1));//using the ascii value of character
    }

    //If we want to return it as an ArrayList
    static ArrayList<String> subseqListAscii(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqList(p+ch, up.substring(1));//Using the character
        ArrayList<String> second = subseqList(p, up.substring(1));//Not using the character
        ArrayList<String> third = subseqList(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        
        return first;
    }

}
