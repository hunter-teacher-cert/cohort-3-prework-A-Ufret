import java.io.*;
import java.util.*;

public class Trianglescan { 
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

int length1;
int length2;
int length3;
     
System.out.print("Welcome to Ashley's Triangle Checker!\nWhen prompted, provide the length of each side to check whether it is a triangle.  ");
        System.out.println("Let's get started!\nType the length of Side 1:");
        length1= in.nextInt();

        System.out.println("Type the length of Side 2:");
        length2= in.nextInt();

        System.out.println("Type the length of Side 3:");
        length3= in.nextInt();
    
      System.out.println("The statement: This is a triangle. For lengths:  " + length1 + ", " + length2 + ", " + length3 + ", " + "is:  " + isTriangle(length1,length2,length3));
    
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