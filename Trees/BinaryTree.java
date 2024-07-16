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
        System.out.println("Do you want a left node of "+ node.value +" ? ");
        boolean left = sc.nextBoolean();

        if(left){
            System.out.println("Enter the value of the left node of : "+ node.value);
            int val = sc.nextInt();
            node.left = new Node(val); 
            helper(sc, node.left);
        }

        System.out.println("Do you want a right node of "+ node.value +" ? ");
        boolean right = sc.nextBoolean();

        if(right){
            System.out.println("Enter the value of the right node of : "+ node.value);
            int val = sc.nextInt();
            node.right = new Node(val); 
            helper(sc, node.right);
        }
    }

    public void display(){
        display(root,"");
    }
    private void display(Node node , String indent){
        if(node == null)
            return;

        System.out.println(indent + node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node , int level){
        if(node == null)
            return;

        prettyDisplay(node.right , level+1);

        if(level != 0){
            //Not on root level so
            for(int i = 0 ; i<level-1 ; i++){
                System.out.print("|\t");
            }
            System.out.println("|----->"+ node.value);
            
        }else{
            System.out.println(node.value);
        }

        prettyDisplay(node.left , level+1);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

}