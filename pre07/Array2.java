import java.io.*;
import java.util.*;
import java.util.Arrays.*;



public class Array2 { 

public static void main(String[] args) {

int size = 100;

int[] a = randomArray(size);


System.out.println(Arrays.toString(a));                                                 
            }                                                                                 

public static int[] randomArray(int size) {

    Random random = new Random();

    int[] a = new int[size];

    for (int i = 0; i < a.length; i++) {

        a[i] = random.nextInt(100);

      }

    return a;
  }
}


//Ch8 Ex1 Question2:  write a method called histogram that takes an int array of scores from 0 to (but not including) 100, and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.