import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class repeatedString{
    
     static int repeatedString(String s, int n) {
         
        int result = 0; 
        
        //counts how many a's are there in the input string, adds to result
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                result++;
            }
        }
        
        //multiples the result by n divided by the string length
        //which gives how many times n can have the input string
        result = result * (n / s.length());
        
        //finally, add the remainder of n divided by the string size to
        //get the remaining input string
        //find the rest of the a's
        for(int i = 0; i < (n % s.length()); i++) {
            if(s.charAt(i) == 'a') {
                result++;    
            }
            
        }
       
        return result;
    }
    
     public static void main(String []args){
         
        String s = "abcac";
        int n = 10;
        
        int result = repeatedString(s, n);
        
        System.out.print(result);
     }
}
