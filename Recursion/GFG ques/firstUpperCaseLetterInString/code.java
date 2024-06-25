//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/

public class code {
    public static void main(String[] args) {
        String x = "hello You";
        System.out.println(first(x));
    }

    //Using iteration
    static char firstU(String x){
        if(x.length() <= 1)
            return x.charAt(0);

        for(int i=0;i<x.length();i++){
            if(Character.isUpperCase(x.charAt(i))){
                return x.charAt(i);
            }
        }
        return 0;
    }

    //Using recursion
    static char first(String x){
        if(x.length() == 0)
            return 0;

        char ch = x.charAt(0);
        if(Character.isUpperCase(ch)){
            return ch;
        }

        return first(x.substring(1));
    }
}
