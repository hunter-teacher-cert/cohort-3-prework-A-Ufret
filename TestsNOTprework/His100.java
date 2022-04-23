import java.io.*;
import java.util.*;
import java.util.Arrays.*;



public class His100 { 

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


import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Array2 { 

public static void main(String[] args) {



 int[] array= {4,10,-3,-44,15,75,60,12,51,19};
  
      System.out.println((histogram(a)));

  
  }

 public static int[] histogram(int[] array, int count){
     int[] array = new int[100];
      for (int element : array) {
         counter[element]++;
      }
      return counter;
   }
    
  
  }


