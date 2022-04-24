import java.io.*;
import java.util.*;
import java.util.Arrays.*;
import java.util.Scanner;

public class Sieve { 

	

	// Java program to print all primes smaller than or equal to
// n using Sieve of Eratosthenes

class SieveOfEratosthenes
{
	void sieveOfEratosthenes(int n)
	{
		// Create a boolean array "prime[0..n]" and initialize
		// all entries it as true. A value in prime[i] will
		// finally be false if i is Not a prime, else true.
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<=n;i++)
			prime[i] = true;
		
		for(int p = 2; p*p <=n; p++)
		{
			// If prime[p] is not changed, then it is a prime
			if(prime[p] == true)
			{
				// Update all multiples of p
				for(int i = p*p; i <= n; i += p)
					prime[i] = false;
			}
		}
		
		// Print all prime numbers

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		  int n; 
	
	
		System.out.println("\nWelcome to Ashley's Prime Calculator!"); 
    System.out.print("\nA prime number is a positive integer that has exactly 2 factors: 1 and the number itself. The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any “given limit.”\n\nTry it! \n\nThink of any number larger than 1 to set as the “given limit.”\n\nUse Eratosthenes’ sieve to find all prime numbers between 0 and the number you chose as the “given limit” by entering your number below:\n");

    n= in.nextInt();
		int i;
    		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == true)
				System.out.print(i + " ");
		} 
    
    System.out.print("The Sieve of Eratosthenes searched between 1 and " + n + " for all prime numbers possible and found the following prime numbers:\n\n " + i);

		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.sieveOfEratosthenes(n);
	
}


	            	}
}
   

//Ch8 Exercise 5   The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
//Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.

//if time permits://add scanner to replace list of integers with input value and set say "Yes, "it" is a prime number." OR "No, "it" is not a prime number."