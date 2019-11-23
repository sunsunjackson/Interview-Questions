import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class FindOddNums{
    
    static List<Integer> oddNumbers(int left, int right) {
        List<Integer> table = new ArrayList(); //creates a new list to store the odd numbers later on
        for(int i = left; i <= right; i++) { //loops thru the list from int left to int right
            if(!(i % 2 == 0)) { //if the current value is an odd number, add it to the table
                table.add(i);
            }
        }
        return table;
    }
    
     public static void main(String []args){
         
        List<Integer> result = new ArrayList();
        result = oddNumbers(2, 8);
        
        System.out.println(result);
     }
}
