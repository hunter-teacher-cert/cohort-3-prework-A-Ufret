import java.io.*;
import java.util.*;

public class Loops3 { 

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int x;
        int n;

        System.out.print("Welcome. ");
        System.out.print("Insert the base:  ");
        x= in.nextInt();

        System.out.print("Enter the exponent: ");
        n= in.nextInt();

        int power = 1;
        while (n > 0) {
            power *= x;
                n--;
}
        System.out.println(power);
        }
    }


//iterative method to perform the calculation:
//6-09: recursive version of power, which takes a double x and an integer n and returns xn.
//remember that anything raised to the *zeroeth power is 1.
/*Original Question from Ch6-9 looks like:
public class Recursive {
	public static double power(double x, int n) {
		if (n == 0) {
			return 1.0;
		}
		else if (n > 0) {
			return x*power(x, n - 1);
		}
		else {
			return 1.0/x * power(1.0/x, -n - 1); 
		}
	}

}*/