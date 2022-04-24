import java.io.*;
import java.util.*;
import java.util.Arrays.*;
import java.util.Scanner;

public class Sieve05scan { 
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		  int i=0,j=0;
		  int n; 
		
	
		System.out.println("\nWelcome to Ashley's Prime Calculator!"); 
    System.out.print("\nA prime number is a positive integer that has exactly 2 factors: 1 and the number itself. The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any “given limit.”\n\nTry it! \n\nThink of any number larger than 1 to set as the “given limit.”\n\nUse Eratosthenes’ sieve to find all prime numbers between 0 and the number you chose as the “given limit” by entering your number below:\n");

    n= in.nextInt();
    
    System.out.print("The Sieve of Eratosthenes searched between 1 and " + n + " for all prime numbers possible and found: ");
    
    
    
    int [] arr = new int[n+1];
	
		for(i=2; i<=n; i++){
			arr[i] = i;
		}
	
		    for(i=2; i<=n; i++){
		    for(j=i+1; j<=n; j++){
	  			if(arr[j] % i == 0 && arr[j] > 0){
					arr[j] = -1;
				}
			}		
		}	
	
	    	for(i=2; i<=n; i++){
			    if(arr[i]>0){

       
    System.out.print(arr[i] + ", ");
        }
      }
    
    System.out.println("\n\nFun Fact: The array will always start with 2! Did you know that 2 is the first prime number and the only even prime number?\nYou can try a larger number to discover more prime integers or visit visit: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes to learn more about The Sieve of Eratosthenes."); 				
		
  }
}
	
//Ch8 Exercise 5   The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
//Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.

//if time permits://add scanner to replace list of integers with input value and set say "Yes, "it" is a prime number." OR "No, "it" is not a prime number."