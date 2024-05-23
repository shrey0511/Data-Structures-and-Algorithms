
public class code {
    public static void main(String[] args) {
        
    }  
    static int findDuplicate(int[] nums) {
        int n=nums.length;
        int[]extra=new int[n];
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(extra[num]!=0)
                return num;    
            extra[num]=num;
        }
        return-1;
    }  
}
