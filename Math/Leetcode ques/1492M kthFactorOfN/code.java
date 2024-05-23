//https://leetcode.com/problems/the-kth-factor-of-n/description/

import java.util.ArrayList;
import java.util.List;

public class code {
    public static void main(String[] args) {
        
    }
    static int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i!=(n/i))
                    list.add(n/i);
                if(k==++count)
                    return i;
            }
        }
        if(list.size() + count < k)
            return -1;
        return list.get(list.size()-(k-count));
    }
}
