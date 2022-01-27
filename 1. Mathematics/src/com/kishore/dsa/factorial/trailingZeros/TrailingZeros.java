package com.kishore.dsa.factorial.trailingZeros;

/***
 * 
 * Finding Trailing Zeros after finding Factorial of the given number
 * E.g) n = 5;
 *      Factorial for '5' = 120, so here for 120 we have 1 trailing zero,
 *      
 *      n = 10;
 *      Factorial for '10' = 3628800, so here for 3628800 we have 2 trailing zeros,
 *       
 * 1. We finding Factorial for the given number,
 * 2. Then we finding trailing zeros in the Factorial
 * 
 */
public class TrailingZeros {

	public static void main(String[] args) {
		int trailingZerosCount = trailingFactorial(10);
		System.out.println(trailingZerosCount);
	}

	private static int trailingFactorial(int n) {
		// 1. Finding Factorial
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}

		// 2. Finding Zeros
		int zeros = 0;
		while (fact % 10 == 0) {
			zeros++;
			fact = fact / 10;
		}

		return zeros;
	}

}
