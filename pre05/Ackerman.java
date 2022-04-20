import java.io.*;
import java.util.*;

public class Ackerman { 
   


	public static int ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		}
		else if (n == 0) {
			return ack(m - 1, 1);
		}
		else {
			return ack(m - 1, ack(m, n - 1)); 
		}
	}
	
	public static void main(String[] args) {
    System.out.println("A(3, 0) = " + ack(3, 0));
    System.out.println("A(0, 3) = " + ack(0, 3));
    System.out.println("A(1, 3) = " + ack(1, 3));
    System.out.println("A(3, 1) = " + ack(3, 1));
    System.out.println("A(2, 3) = " + ack(2, 3));
    System.out.println("A(3, 2) = " + ack(3, 2));
    System.out.println("A(3, 3) = " + ack(3, 3));
    }
}

//Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.