import java.io.*;
import java.util.*;

public class Triangle { 
   
  public static void main(String[] args){
   System.out.println(isTriangle(5,15,7));  
    }

	public static boolean isTriangle(int length1, int length2, int length3) {	

    if (length1 > (length2 + length3)) {
			    return false;
		
        } else if (length2 > (length1 + length3)) {
			    return false;
      
		    } else if (length3 > (length1 + length2)) {
			    return false;
		
        } else {
			    return true;
		}
	}
}
  //Ch6 Ex.3: A program to see if 3 lengths can be a triangle, condition: if the sum of two lengths is greater than the remaining length, the three cannot construct a triangle. 