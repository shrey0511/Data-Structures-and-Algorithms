//https://www.geeksforgeeks.org/product-2-numbers-using-recursion/

public class code {
    public static void main(String[] args) {
        System.out.println(product(3,4));
    }

    static int product(int x , int y){
        if(x<y)
            return product(y, x);

        else if(y!=0){
            return x + product(x, y-1);
        }

        else{
            return 0;
        }
    }
}
