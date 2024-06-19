public class print1toN {
    public static void main(String[] args) {
        funRev(5);
        System.out.println(" ");
        fun(5);
    }

    static void funConcept(int n){
        if(n == 0)
            return;
        
        System.out.println(n);
        funConcept(n--);//This gives out an infinite loop as n is passed everytime
        
        funConcept(--n);//This doesn't
    }

    static void fun(int n){
        if(n==0)
            return;
        
        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n){
        if(n==0)
            return;
        
        funRev(n-1);
        System.out.println(n);
    }
}
