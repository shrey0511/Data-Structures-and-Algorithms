

public class fibonacci{
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }   

    static int fiboFormula(int n){
        //Just for demo , use LONG instead
        return (int) (Math.pow(((1+Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
    
    static int fibo(int n){

        //Base condition
        if(n<2)
            return n;

        return fibo(n-1) + fibo(n-2);
    }
}
//Time complexity not 2^n but goldenRatio^n