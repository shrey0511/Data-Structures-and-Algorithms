//https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/?envType=daily-question&envId=2024-07-05

public class code {
    public static void main(String[] args) {
        
    }

    //* Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        ListNode prev = head , curr = head.next , next = curr.next;
        int prePos = -1 , firstPos = -1 , currPos = -1 , position = 1;

        while(next != null){
            if( curr.val < prev.val && curr.val < next.val || curr.val > prev.val && curr.val > next.val){
                prePos = currPos; //-1 for thi first time
                currPos = position;

                if(firstPos == -1){
                    firstPos = position;
                }

                if(prePos != -1){
                    if( ans[0] == -1){
                        ans[0] = currPos - prePos;
                    }else{
                        ans[0] = Math.min(ans[0] , currPos-prePos);
                    }
                    ans[1] = position - firstPos;
                }

            }
            position++;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        return ans;
    }
}
