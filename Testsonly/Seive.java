import java.io.*;
import java.util.*;

public class Seive { 

public static void main(String[] args) {

    System.out.println(Arrays.toString(i));
  }
 public static int indexOfMax(int[] a) {
        int l = 0;
        for (int i = a.length - 1; i > 0; i--) {
            if (a[l] < a[i]) {
                l = i;
            }
        }
        return l;
    }
}

//Ch8 Exercise 5   The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
//Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.