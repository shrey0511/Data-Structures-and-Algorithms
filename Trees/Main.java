import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(sc);
        // tree.prettyDisplay();

        // BinarySearchTree tree = new BinarySearchTree();
        // int[] nums = {5,2,7,1,4,6,9,8,3,10};
        // tree.populate(nums);
        // tree.display();
        // System.out.println(tree.balanced());

        //If we take a sorted array in the above example we will get a right
        //skewed tree and to avoid that either we can use self balancing trees
        //like AVL or we can take the middle element and then create the tree

        // AVL tree = new AVL();
        // for(int i = 0 ; i<1000 ; i++){
        //     tree.insert(i);
        // }

        // tree.display();

        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
        //tree.display();

        System.out.println(tree.query(1, 6));
    }
}
