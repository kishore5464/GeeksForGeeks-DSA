package com.kishore.dsa.primeFactors;

/***
 * Prime Factor are those divisor of the given number which are Prime.
 * 
 * E.g) n = 12; 
 * 		Here 'n' has multiple divisor's like (2, 3, 4, 6, 12) in this
 * 		divisor which are Prime is called as Prime Factors.
 * 
 * i.e) 2, 2, 3 -> How we get 2, 2, 3 because 4 is also a divisor of 12. So for
 * 				that 4 we have 2 is a divisor. The result is 2, 2, 3
 *
 */
public class PrimeFactors_Naive {

	public static void main(String[] args) {
		primeFactors(12);
	}

	private static void primeFactors(int n) {

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				int x = i;

				while (n % x == 0) {
					x = x * i;
					System.out.println(i);
				}
			}
		}
	}

	// Finding the given number Prime or Not
	private static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		if (n == 2 || n == 3) {
			return true;
		}

		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i < n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return true;
			}
		}
		
		return false;
	}
}

// Time Complexity = O(n^2 log n)
