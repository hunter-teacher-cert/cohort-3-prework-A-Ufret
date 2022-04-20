import java.io.*;
import java.util.*;

public class Divisible { 
 public static void main(String[] args){
   System.out.println(isDivisible(5,3));  
}
      public static boolean isDivisible(int n, int m) {
          if (m != 0 && n % m == 0) {
        return true;
            } else {
        return false;
     }       
        }
}
   


////Ch6 Ex.2 Create method isDivisible needs to return A method to test if the first argument is divisible by the second argument
      //param n the integer to be divided
      //param m the integer to divide
      //return true if m is not `0` and n is divisible by m 