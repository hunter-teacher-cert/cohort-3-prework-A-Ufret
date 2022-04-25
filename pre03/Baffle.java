import java.io.*;
import java.util.*;

public class Baffle { 

        
public static void zoop() {
    baffle();
    System.out.print("You wugga ");
    baffle();
}

public static void main(String[] args) {
    System.out.print("No, I ");
    zoop();
    System.out.print("I ");
    baffle();
}

public static void baffle() {
    System.out.print("wug");
    ping();
}

public static void ping() {
    System.out.println(".");
    }
  }


/*Ch4 Exercise 1  
The point of this exercise is to practice reading code and to make sure that you understand the flow of execution through a program with multiple methods.

1. What is the output of the following program? Be precise about where there are spaces and where there are newlines.
Hint: Start by describing in words what ping and baffle do when they are invoked.

2. Draw a stack diagram that shows the state of the program the first time ping is invoked.
3. What happens if you invoke baffle(); at the end of the ping method? (We will see why in the next chapter.)*/

/* added baffle(); at the end of ping method to test part 3 of Exercise 1: 
(note: remove comment symbols to run test)
public static void zoop() {
    baffle();
    System.out.print("You wugga ");
    baffle();
}

public static void main(String[] args) {
    System.out.print("No, I ");
    zoop();
    System.out.print("I ");
    baffle();
}

public static void baffle() {
    System.out.print("wug");
    ping();
}

public static void ping() {
    System.out.println(".");
    baffle();
  }
  }
*/