//https://www.geeksforgeeks.org/problems/circular-tour-1587115620/1

public class code {
    public static void main(String[] args) {
        
    }

    static int tour(int petrol[], int distance[]){
        //my code
        int totalPetrol = 0;
        int currentPetrol = 0;
        int startingPoint = 0;
        
        for(int i = 0 ; i<petrol.length ; i++){
            totalPetrol += petrol[i] - distance[i];
            currentPetrol += petrol[i] - distance[i];
            
            if(currentPetrol < 0){
                //Cannot start from this starting point
                startingPoint = i+1;
                currentPetrol = 0;
            }
        }
        
        return totalPetrol >= 0 ? startingPoint : -1;
    }
}
