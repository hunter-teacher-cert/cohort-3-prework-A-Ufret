import java.io.*;
import java.util.*;

public class Grapes { 

public static void main(String[] args) {

  }


public static int grapefruit(int[] a, int grape) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == grape) {
            return i;
        }
    }
    return -1;
}
}