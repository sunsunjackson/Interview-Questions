import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class FindTargetInt{
    
    static String FindTargetInt(int[] arr, int target) {
        String yes = "YES";
        String no = "NO";
        String result = "hello";
        
        for(int i = 0; i < arr.length; i++) { //loops through the array of integers
            if(arr[i] == target) { //check if the current value equals to the target value
                result = yes; //if the target value is found, breaks the program and return "YES"
                break;
            }
            else{
                result = no; //otherwise, print "NO"
            }
        }
        
        return result;
    }
    
     public static void main(String []args){
         
        int[] arr = new int[] {1, 3, 5, 7, 9};
        int k = 6;
        String result = FindTargetInt(arr, k);
        System.out.print(result);
     }
}
