public class BinarySearchTree {

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BinarySearchTree(){

    }

    public int height(Node node){
        if(node == null)
            return -1;

        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(root, value);
    }
    private Node insert(Node node , int value){
        //We stop recursion when we find the correct null spot for new node
        if(node == null){
            node = new Node(value);
            return node;    
        }

        //Finding the correct spot acc. to BST
        if(value < node.value){
            node.left = insert(node.left, value);
        }

        if(value > node.value){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left) , height(node.right)) + 1;

        return node;//nodes are returned after addition of the new node
    }

    //running insert function through an array
    public void populate(int[] nums){
        for(int i = 0 ; i<nums.length ; i++){
            this.insert(nums[i]);
        }
    }

    //For sorted data ,to avoid skewed tree
    public void populateSorted(int[] nums){
        populateSorted(nums , 0 , nums.length);
    }
    //Time complexity: Inserting n elements & each operation logn -> nlogn
    private void populateSorted(int[] nums,int start , int end){
        if(start >= end)
            return;

        int mid = (start + end) / 2;

        this.insert(mid);

        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root, "Root Node : ");
    }
    private void display(Node node , String details){
        if(node == null)
            return;

        System.out.println(details + node.getValue());

        display(node.left , "Left child of "+node.getValue()+" : ");
        display(node.right , "Right child of "+node.getValue()+" : ");
    }

}
