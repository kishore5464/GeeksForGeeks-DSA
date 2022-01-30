package com.kishore.dsa.prime;

public class CheckPrime_Optimized {

	public static void main(String[] args) {

		boolean prime = primeOptimized(65);
		System.out.println(prime);
	}

	private static boolean primeOptimized(int x) {

		// Here we are multiplying i*i to do square root time
		for (int i = 2; i * i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}
}

// Time Complexity = O(Square Root(n))