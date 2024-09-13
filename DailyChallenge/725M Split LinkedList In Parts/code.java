public class code {
    public static void main(String[] args) {
        
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        if(head == null)
            return ans;

        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        int minSize = len / k;
        int r = len % k;

        ListNode curr = head , prev = null;
        
        for(int i = 0 ; curr != null && i<k ; i++,r--){
            ans[i] = curr;

            for(int j = 0 ; j < minSize + ((r>0)? 1 : 0) ; j++){
                prev = curr;    
                curr = curr.next;
            }

            if(prev != null){
                prev.next = null;
            }
        }
        return ans;
    }
}
