//https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/

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

    static ListNode removeZeroSumSublists(ListNode head) {
        if(head.val == 0 && head.next == null) return null;
        if(head.next == null) return head;
        //Dummy node to handle edge cases of head removal
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        HashMap<Integer,ListNode> map = new HashMap<>();
        int prefixSum = 0;

        for(ListNode curr = dummy ; curr!=null ; curr=curr.next){
            prefixSum += curr.val;

            if(map.containsKey(prefixSum)){
                ListNode prev = map.get(prefixSum);
                ListNode toRemove = prev.next;
                int p = prefixSum + (toRemove!=null? toRemove.val : 0) ;
                while(p != prefixSum){
                    map.remove(p);
                    toRemove = toRemove.next;
                    p += (toRemove != null)? toRemove.val : 0;
                }
                prev.next = curr.next;
            }else{
                map.put(prefixSum,curr);
            }
        }
        return dummy.next;
    }
}
