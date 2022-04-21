import java.io.*;
import java.util.*;

public class Array { 

public static void main(String[] args) {

  }
  
public static int search(double[] a, double target) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == target) {
            return i;
        }
    }
    return -1;
}
  }


//Ch8 Ex1 Pt1: Starting with the code in Section 8.6, write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.