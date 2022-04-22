import java.io.*;
import java.util.*;

public class Max { 

public static void main(String[] args) {
  int[] arr = new int[] arr{3,10,18,7,74};
   printArray(array);
  }

public static int indexOfMax(int[] arr, int lowIndex, int highIndex) {
		int indexOfMax = lowIndex;
		
		for (int i = lowIndex+1; i <= highIndex; i++) {
			if (arr[i] > arr[indexOfMax]) {
				indexOfMax = i;
			}
		}
		return indexOfMax; 
	}
  }


//Ch8 Exercise 4   Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?