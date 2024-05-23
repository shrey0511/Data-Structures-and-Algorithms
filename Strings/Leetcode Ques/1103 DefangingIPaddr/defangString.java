//https://leetcode.com/problems/defanging-an-ip-address/description/

public class defangString {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        String res = defangIP(address);
        System.out.println(res);
    }
    static String defangIP(String address){
        StringBuilder sb = new StringBuilder();
        for(char c : address.toCharArray()){
            sb.append((c=='.')?"[.]":c);
        }
        return sb.toString();
    }
}
