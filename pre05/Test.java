import java.io.*;
import java.util.*;

public class Test {
  public static void main(String args[]){
         lyricsFor(int bearNumber);
      if (bearNumber > 0){
           System.out.println(bearNumber + " bottles of beer on the wall,");
         System.out.println(bearNumber + " bottles of beer,");
         System.out.println("ya' take one down, ya' pass it around,");
         System.out.println(bearNumber-- + "bottles of beer on the wall.");
         lyricsFor(bearNumber);
      } 
      else {
         System.out.println("No bottles of beer on the wall,");
         System.out.println("no bottles of beer,");
         System.out.println("ya' can't take one down, ya' can't pass it around,");
         System.out.println("'cause there are no more bottles of beer on the wall!");
      }
    }
}