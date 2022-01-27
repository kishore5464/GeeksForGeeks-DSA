package com.kishore.dsa.factorial;

public class Factorial_Iterative {

	public static void main(String[] args) {
		int fact = factorial(5);
		System.out.println(fact);
	}

	private static int factorial(int n) {
		int fact = 1;

		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}

		return fact;
	}

}

// Time Complexity = O(n)
// Auxiliary Space = O(1)
