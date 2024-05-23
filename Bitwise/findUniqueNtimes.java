public class findUniqueNtimes {
        public static void main(String[] args) {
        int[]arr = {1,1,1,5,3,3,3,10,10,10,7,7,7};
        System.out.println(detect(arr,3));
    }
        static int detect(int[]arr,int repeatationTime){
        int ans = 0;
        for(int i=0;i<32;i++){
            int sum = 0;
            for(int num:arr)
                sum += (num>>i)&1;
            sum %= repeatationTime;
            ans |= sum<<i;
        }
        return ans;
    }
}