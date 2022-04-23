import java.io.*;
import java.util.*;
import /java.util.Arrays.*;

public class Array2 { 

public static void main(String[] args) {

  }

 public static int[] histogram(int[] array, int count){
      int[] counter = new int[100];
      for (int element:array){
         counter[element]++;
      }
      return counter;
   }
  
    System.out.println(counter);
  }

//Ch8 Ex1 Pt2:  write a method called histogram that takes an int array of scores from 0 to (but not including) 100, and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.