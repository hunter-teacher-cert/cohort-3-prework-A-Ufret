import java.io.*;
import java.util.*;

public class Loops2 { 

  public static void main(String[] args){
   System.out.println(squareRoot(70));
    }   
   public static double squareRoot(double a){
      double oldValue = a/2;
      double newValue = a/2;
      double interval = 0;
      do{
         oldValue = newValue;
         newValue = (oldValue + a/oldValue)/2;
         interval = Math.abs(newValue - oldValue);
         System.out.println(interval);
      }while(interval > 0.001);
      return newValue;
   }
}
