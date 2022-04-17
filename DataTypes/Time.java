import java.io.*;
import java.util.*;

public class Time {
   public static void main(String args[]){
      Scanner console = new Scanner(System.in);
      System.out.print("Input the time in seconds: ");
      int temp = console.nextInt();
      int hour = temp / 3600;
      int seconds = temp % 3600;
      int minute = seconds / 60;
      seconds = seconds % 60;
      System.out.printf("%d second(s) = %d hour(s), %d minute(s), and %d second(s)", temp, hour, minute, seconds);
   }
} 