//https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/

public class code {
    public static void main(String[] args) {
        String x1 = "geeksforgeeks";
        System.out.println(noDuplicates(x1));
    }   

    //Using iteration(Sliding window)
    static String noDuplicates(String x){
        int l = 0 , r = 0;
        String newElements = "";
        while(r < x.length()){
            if(x.charAt(l)==x.charAt(r))
                r++;
            else if(x.charAt(r) != x.charAt(l) || r == x.length()-1){
                newElements += x.charAt(l);
                l=r;
                r++;
            }
        }
        newElements += x.charAt(r-1);
        return newElements;
    }
    
    //Using recursion
    static String noDuplicatesRec(String x){
        if(x.length() <= 1)
            return x;
        
        if(x.charAt(0) == x.charAt(1)){
            return noDuplicates(x.substring(1));
        }else{
            return x.charAt(0) + noDuplicates(x.substring(1));
        }

    }
}
