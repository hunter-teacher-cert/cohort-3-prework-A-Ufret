import java.io.*;
import java.util.*;

public class Maxtest { 

public static void main(String[] args) {
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
