import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class SockMerchant{
    
     static int sockMerchant(int n, int[] ar) {
        int result = 0; //number of pairs
        // if(ar.length == 0) { //if the array is empty, return 0
        //     return result;
        // }

        Set<Integer> table = new HashSet(); //let's use hash table
        for(int i = 0; i < ar.length; i++) { //go through the array based on its lenght
            if(!table.contains(ar[i])) { //if the current element is empty, insert it
                table.add(ar[i]); //in other words, fill up the hash table
            }
            else { //otherwise, if a matching element is found, result++
                result++; 
                table.remove(ar[i]); //remove the found element
            }
        }
    return result; 
    }
    
     public static void main(String []args){
         
        int[] arr = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n = 9;
        int result = sockMerchant(n, arr);
        System.out.print(result);
     }
}
