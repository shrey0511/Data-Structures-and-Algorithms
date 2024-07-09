//https://leetcode.com/problems/average-waiting-time/?envType=daily-question&envId=2024-07-09

public class code {
    public static void main(String[] args) {
        
    }

    static double averageWaitingTime(int[][] customers) {
        double wait = 0.0;//Stores the total wait time for all the customers
        int time = customers[0][0];
        for( int[] arr : customers ){
            if(time > arr[0]){ //Running time greater than arrival
                time += arr[1];
            }else{//Arrival is greater than running time so increase running time
                time = arr[0] + arr[1];
            }
            wait += (time - arr[0]);//Take out the arrival time and add the wait time
        }

        return (wait/customers.length);//Avg returned
    }


}
