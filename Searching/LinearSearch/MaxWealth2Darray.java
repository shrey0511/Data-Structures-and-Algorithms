public class MaxWealth2Darray {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,3},
            {15,6},
            {90,9}
        };
        System.out.println(maxWealth(accounts));
    }
    static int maxWealth(int[][] arr){
        int max=0,element=0;
        for(int person=0;person<arr.length;person++){
            int sum=0;
            for(int account=0;account<arr[person].length;account++){
                sum+=arr[person][account];
            }
            if(sum>max){
                max=sum;
                element=person+1;
            }
        }
        System.out.println("The person having the max wealth is " +element);
        return max;
    }
}
