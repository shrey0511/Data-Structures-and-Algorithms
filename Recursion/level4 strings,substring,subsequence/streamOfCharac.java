//Skip a character , here we are skipping 'a'

public class streamOfCharac {
    public static void main(String[] args) {
        //skip("null", "abccdad");
        System.out.println(skip2("baccdah"));
    }

    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
        return;
    }

    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            //Just return rest of the answer not the current character
            return skip2(up.substring(1));
        }else{
            //When it is not 'a'
            return ch + skip2(up.substring(1));
        }
    }

    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            //Just return rest of the answer not the current character
            return skip2(up.substring(5));
        }else{
            //When it is not 'a'
            return up.charAt(0) + skip2(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            //Just return rest of the answer not the current character
            return skip2(up.substring(3));
        }else{
            //When it is not 'a'
            return up.charAt(0) + skip2(up.substring(1));
        }
    }
}
