import java.io.*;
import java.util.*;

public class T063 { 

    public static void main(String[] args){
      System.out.println(power(3,2));
      }
    public static double power(double x, int n){
      double result = 1;
      int i = n; 
      for (i=0;i<n;i++){
         result *= x;
      }
      return result;
   

      
        
        }
    }



//iterative method to perform the calculation:
//6-09: recursive version of power, which takes a double x and an integer n and returns xn.
//remember that anything raised to the *zeroeth power is 1.
/*Original Question from Ch6-9 looks like:
public class Recursive {
	public static double power(double x, int n) {
		if (n == 0) {
			return 1.0;
		}
		else if (n > 0) {
			return x*power(x, n - 1);
		}
		else {
			return 1.0/x * power(1.0/x, -n - 1); 
		}
	}

}*/