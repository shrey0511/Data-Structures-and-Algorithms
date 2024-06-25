//https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/

public class code {
    public static void main(String[] args) {
        String x = "geeksforgeeks";
        System.out.println(lengthString(x));
    }

    static int lengthString(String x){
        if(x.length() == 1)
            return 1;

        int count = 1;
        return count + lengthString(x.substring(1));
    }
}
