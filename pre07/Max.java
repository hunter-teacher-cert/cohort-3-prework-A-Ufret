import java.io.*;
import java.util.*;
import java.util.Arrays.*;


public class Max { 

public static void main(String[] args) {
  int[] a;
a = new int[5]; 
a = [1, 2, 3, 4, 5];

System.out.println(Arrays.toString(a));
 

public static int indexOfMax(int[] a, int lowIndex, int highIndex) {
		int indexOfMax = lowIndex;
		int i = 0
		for (int i = lowIndex+1; i <= highIndex; i++) {
			if (a[i] > a[indexOfMax]) {
				indexOfMax = i;
			}
		}
	
	}
}
}

  


//Ch8 Exercise 4   Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?