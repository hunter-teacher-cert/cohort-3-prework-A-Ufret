import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Max04 { 


public static void main (String args[]){
       int numbers[]= {4,10,-3,-44,15,75,60,12,51,19};

         
  System.out.println("Maximum Value = " + getMaxValue(numbers));
    }
 
    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
}