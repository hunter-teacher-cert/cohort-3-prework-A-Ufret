import java.io.*;
import java.util.*;

public class Guess {

    public static void main(String[] args) {
       
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }
}
 // pick a random number