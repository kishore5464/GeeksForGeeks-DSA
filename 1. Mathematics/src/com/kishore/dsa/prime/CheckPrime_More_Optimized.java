package com.kishore.dsa.prime;

/***
 * 
 *  Logic: By adding 2 checks 
 *  	1. n % 2 == 0 -> In this check we can ignore the EVEN numbers, 
 *  					 because '2' is the only EVEN Prime other EVEN numbers are Composite.
 *  
 *  	2. n % 3 == 0 -> In this check we can ignore the numbers which divisible by '3'
 *  
 *  
 *   Lets Consider: n = 25
 *   2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25.
 *   
 *   	1. n % 2 == 0 -> 2, 4, 6, 10, 12, 14, 16, 18, 20, 22, 24 will get vomited,
 *   					 balance = 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25
 *   
 *   	2. n % 3 == 0 -> 3, 6, 9, 12, 15, 18, 21, 24 will get vomited,
 *   					 balance = 5, 7, 11, 13, 17, 19, 23, 25
 *
 *	 Now when we add these two checks many iterations are skipped.
 *
 */
public class CheckPrime_More_Optimized {

	public static void main(String[] args) {

		boolean prime = primeOptimized(65);
		System.out.println(prime);
	}

	private static boolean primeOptimized(int x) {

		if (x == 1) {
			return true;
		}

		if (x % 2 == 0 || x % 3 == 0) {
			return false;
		}

		/***
		 * Here we start 'i' from 5 because, 1,2,3,4 got checked already above checks.
		 * Then increment of ('i' = i + 6) because after '5' number '7' is Prime just
		 * one number greater than '5' so after '7' we have '11' is Prime so (5+6=11)
		 */
		for (int i = 5; i < x; i = i + 6) {
			if (x % i == 0 || x % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}
}

// Time Complexity = O(Square Root(n))