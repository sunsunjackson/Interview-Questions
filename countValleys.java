import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class countValleys{
    
     static int countValleys(int n, String arr) {
         
        int result = 0; //keep count on how many valleys
        int altitude = 0; //keeps track on whether 
                         //you are on sea level, which is 0
                         
        for(int i = 0; i < arr.length(); i++) {
            if(arr.charAt(i) == 'U') { //if Uphill, then altitude goes up
                if(altitude == -1) { //if altitude is -1 before it goes Uphill,
                                    //it means that it will be sea level after the step
                                    //therefore, the count for valleys goes up
                    result++;
                }
                altitude++;
            }
            else if(arr.charAt(i) == 'D') { //if Downhill, then altitude goes down
                altitude--;
            }
        }
        
        return result;
    }
    
     public static void main(String []args){
         
        String arr = "DDUUDDUDUUUD";
        int n = 12;
        
        int result = countValleys(n, arr);
        System.out.print(result);
     }
}
