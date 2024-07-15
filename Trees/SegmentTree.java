public class SegmentTree {

    public static void main(String[] args) {
        int[] nums = {};
        SegmentTree tree = new SegmentTree(nums);
    }

    private class Node{
        int data;
        int start;
        int end;
        Node left;
        Node right;

        public Node(int startInterval , int endInterval){
            this.start = startInterval;
            this.end = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr){
        //create a tree using this array (O(n) for creation of tree)
        this.root = constructTree(arr , 0 , arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start == end){
            //leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        //Create a new node with index you are at
        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid+1, end);

        node.data = node.left.data + node.right.data;
        return node;

    }

    public void display() {
        display(this.root);
    }
    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str + "Interval = [" + node.left.start + "-" + node.left.end + 
            "] and data: " + node.left.data + " => ";
        }else{
            str = str + "No left child";
        }

        //for current node
        str = str + "Interval = [" + node.start + "-" + node.end + 
            "] and data: " + node.data + " => ";
        
        if(node.right != null){
            str = str + "Interval = [" + node.right.start + "-" + node.right.end + 
            "] and data: " + node.right.data;
        }else{
            str = str + "No right child";
        }

        System.out.println(str + "\n");

        //call recursion
        if(node.left != null){
            display(node.left);
        }

        if(node.right != null){
            display(node.right);
        }
    }

    //query
    public int query(int startIndex , int endIndex){
        return this.query(this.root,startIndex, endIndex);
    }
    private int query(Node node , int startIndex , int endIndex){
        if(node.start >= startIndex && node.end <= endIndex){
            //node is completely inside query
            return node.data;
        }else if(node.start > endIndex || node.end < startIndex){
            //completely outside the query
            return 0;
        }else{
            //Partially inside query
            return query(node.left, startIndex, endIndex) + query(node.right, startIndex, endIndex);
        }
    }

    //update
    public void update(int index , int value){
        this.root.data = update(this.root,index, value);
    }
    private int update(Node node , int index , int value){

        if(index >= node.start && index <= node.end){

            if(index == node.start && index == node.end){
                node.data = value;
                return node.data;
            }else{
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        //If completely outside
        return node.data;
    }

}
