import java.io.*;
import java.util.*;

public class Celsius{
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      System.out.print("Input temperatur in Celsius: ");
      double temperature = console.nextDouble();
      double temperatureInF = temperature * 9 / 5 + 32;
      System.out.printf("%.1f C = %.1f F", temperature, temperatureInF);
   }
}