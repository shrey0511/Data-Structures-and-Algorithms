import java.util.Scanner;

class BinaryTree{

    private static class Node{

        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }

    }

    private Node root;

    // to insert elements
    public void populate(Scanner sc){
        System.out.println("Enter the value of the root node : ");
        int value = sc.nextInt();
        root = new Node(value);
        helper(sc,root); //to insert rest of the nodes
    }

    private void helper(Scanner sc , Node node){
        System.out.println("Do you want a left node ? ");
        boolean left = sc.nextBoolean();

        if(left){
            System.out.println("Enter the value of the left node of : "+ node.value);
            int val = sc.nextInt();
            node.left = new Node(val); 
            helper(sc, node.left);
        }

        System.out.println("Do you want a right node ? ");
        boolean right = sc.nextBoolean();

        if(right){
            System.out.println("Enter the value of the right node of : "+ node.value);
            int val = sc.nextInt();
            node.right = new Node(val); 
            helper(sc, node.right);
        }
    }

}