//https://leetcode.com/problems/hand-of-straights/?envType=daily-question&envId=2024-06-06

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        
    }

    static boolean isNthStraightHand(int[] hand,int groupSize){
        int size = hand.length;
        if(size % groupSize != 0)
            return false;
        Arrays.sort(hand);

        for(int i = 0 ; i<size ; i++){
            if(hand[i] >= 0){
                if(!sucessor(hand, groupSize, i, size))
                    return false;
            }
        }
        return true;
    }

    static boolean sucessor(int[] hand , int groupSize , int index , int size){
        int nextCheck = hand[index]+1;
        hand[index] = -1;
        index += 1;
        int count = 1;

        while(index<size && count < groupSize){
            if(nextCheck == hand[index]){
                nextCheck = hand[index]+1;
                hand[index] = -1;
                count++;
            }
            index++;
        }
        if(count == groupSize)
            return true;
        return false;
    }
}

// Try your approach too

// class Solution {
//     public boolean isPossibleDivide(int[] nums, int k) {
//         HashMap<Integer,Integer>hm=new HashMap<>();
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
//         }
//         for(int i:nums){
//             while(hm.containsKey(i)){
//                 int dummy=k;
//                 dummy--;
//                 int val=i+1;
//                 while(dummy-- >0){
//                     if(hm.containsKey(val)){
//                         hm.put(val,hm.get(val)-1);
//                         if(hm.get(val)==0){
//                             hm.remove(val);
//                         }
//                     }
//                     else{
//                         return false;
//                     }
//                     val++;
//                 }
//                 hm.put(i,hm.get(i)-1);
//                 if(hm.get(i)==0){
//                     hm.remove(i);
//                 }
//             }
//         }
//         return hm.isEmpty();

//     }
// }
