import java.io.*;
import java.util.*;

public class Test { 
    public static void main(String[] args){
       int beerNum = 99;
       String word = "bottles";
 
       while (beerNum > 0) {
 
        if (beerNum == 1) {
         word = "bottle"; 
          }
        System.out.println(beerNum + " " + word + " of beer on the wall,");
        System.out.println("ya' take one down");
        System.out.println("ya' pass it around");
        beerNum = beerNum - 1;
 
        if (beerNum > 0) {
         System.out.println(beerNum + " " + word + " of beer on the wall");
         } 
        else {
          System.out.println("No bottles of beer on the wall,\nno bottles of beer,\nya' can't take one down, ya' can't pass it around,\ncause there are no more bottles of beer on the wall!");
        }
       }
 }
}