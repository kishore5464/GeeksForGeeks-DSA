package com.kishore.dsa.factorial;

public class Factorial_Recursive {
	public static void main(String[] args) {
		int fact = factorial(5);
		System.out.println(fact);
	}

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);
	}
}

// Time Complexity = O(n)
// Auxiliary Space = O(n)
