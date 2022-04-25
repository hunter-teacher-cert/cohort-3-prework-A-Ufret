import java.io.*;
import java.util.*;
import java.util.Arrays.*;


public class Seive05 { 


class SieveOfEratosthenes
{
	void sieveOfEratosthenes(int n)
	{
	
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<=n;i++)
			prime[i] = true;
		
		for(int p = 2; p*p <=n; p++)
		{
			
			if(prime[p] == true)
			{
			
				for(int i = p*p; i <= n; i += p)
					prime[i] = false;
			}
		}
	
		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == true)
				System.out.print(i + " ");
  
    
    n = i;
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.sieveOfEratosthenes(n);

      }
    }

	public static void main(String args[]){

		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
    
	
}
}
}


//Ch8 Exercise 5   The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
//Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.

//if time permits://add scanner to replace list of integers with input value and set say "Yes, "it" is a prime number." OR "No, "it" is not a prime number."