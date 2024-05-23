//Moore Voting Algorithm
// Intuition:
// The intuition behind the Moore's Voting Algorithm is based on the fact that if 
// there is a majority element in an array, it will always remain in the lead, even 
// after encountering other elements.

public class code {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,1};
        int majorityElement = majority(arr);
        System.out.println(majorityElement);
    }   
    static int majority(int[] arr){
        int count = 0 , candidate = 0;
        for(int num : arr){
            if(count==0){
                candidate = num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    } 
}

