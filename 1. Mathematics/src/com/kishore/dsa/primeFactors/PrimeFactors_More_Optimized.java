package com.kishore.dsa.primeFactors;

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
public class PrimeFactors_More_Optimized {

	public static void main(String[] args) {
		primeFactors(84);
	}

	private static void primeFactors(int n) {

		if (n <= 1) {
			return;
		}

		while (n % 2 == 0) {
			System.out.println(2);
			n = n / 2;
		}

		while (n % 3 == 0) {
			System.out.println(3);
			n = n / 3;
		}

		for (int i = 5; i * i <= n; i = i + 6) {

			while (n % 5 == 0) {
				System.out.println(i);
				n = n / i;
			}

			while (n % (i + 2) == 0) {
				System.out.println(i);
				n = n / (i + 2);
			}
		}

		if (n > 3) {
			System.out.println(n);
		}
	}
}

// Time Complexity = O(SquareRoot(n))
