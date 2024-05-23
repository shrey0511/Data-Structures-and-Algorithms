//https://leetcode.com/problems/angle-between-hands-of-a-clock/description/

public class code {
    public static void main(String[] args) {
        
    }   
    static double angleClock(int hour, int minutes) {
        //60 mins mein hour hand ghumta hai 30 degree
        //So effect of minute hand on hour hand is:
        //1 min mai -> hour hand ghumega 0.5 degree
        double sumH = 0.00 , sumM = 0.00;
        //1 hour mai 30 degree
        //1 min mai 6 degree
        sumH = ((hour%12) * 30) + (minutes*0.5);
        sumM = minutes * 6;
        double angle = (sumH>sumM)? sumH-sumM : sumM-sumH;
        if(angle>180)
            angle = 360.0 - angle;
        return angle;
    } 
}
