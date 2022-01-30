package com.kishore.dsa.prime;

public class CheckPrime_Naive {

	public static void main(String[] args) {

		boolean prime = prime(73);
		System.out.println(prime);
	}

	private static boolean prime(int x) {

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}
}

// Time Complexity = O(n)