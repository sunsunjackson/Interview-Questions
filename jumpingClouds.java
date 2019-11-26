import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class jumpingClouds{
    
     static int jumpingClouds(int[] arr) {
         
        int result = 0; //keeps track on how many steps were taken minimally
        
        
        for(int i = 0; i < arr.length - 1; i++) {
            
            if(arr[i + 2] == arr.length || arr[i + 2] == 1) { //checks whether
                                //the next next number is 1 or if it reaches the
                                //end. If it's right, then move one step only
                result++;
            }
            else { //this means that the next next number is 0, which means
                    //we can skip a step
                i++;
                result++;
            }
        }
        
        
        return result;
    }
    
     public static void main(String []args){
         
        int[] arr = new int[] {0, 0, 1, 0, 0, 1, 0};
        
        int result = jumpingClouds(arr);
        System.out.print(result);
     }
}
