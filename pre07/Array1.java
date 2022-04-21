import java.io.*;
import java.util.*;

public class Array1 { 
  public static void main(String[] args) {
    double[] a = new double[]{5, 6, 8, 7};
    System.out.println(Arrays.toString(powArray(a)));
}
  public static double[] powArray(double a[]) {
    for (int i = 0; i < a.length; i++) {
         a[i] = Math.pow(a[i], 2.0);
    }
    return a;
}
}

//Ch8 Ex1 Pt1: Starting with the code in Section 8.6 (pasted below), write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.
/*                       Code in section 8.6:
import java.io.*;
import java.util.*;

public class Ch7Question1 { 
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
  }             */