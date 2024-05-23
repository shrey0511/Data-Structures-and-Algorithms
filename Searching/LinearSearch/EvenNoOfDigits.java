public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {1,-1768,1,22,9};
        System.out.println(findAboutNumbers(arr));
    }
    static int findAboutNumbers(int[] arr){
        int count=0;
        for(int element:arr){
               
            if(even(element)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits2(num);
        return numberOfDigits%2==0;
    }

    static int digits(int num){
        int count=0;
        if(num==0)
                return 1;
        if(num<0)
            num=num*-1; 
        while (num>0) {
            count++;
            num/=10;
        }
        return count;
    }

    static int digits2(int num){
        if(num<0)
            num=num*-1;
        return (int) Math.log10(num)+1;    
    }
}
