package com.kishore.dsa.primeFactors;

public class PrimeFactors_Optimized {

	public static void main(String[] args) {
		primeFactors(12);
	}

	private static void primeFactors(int n) {

		if (n <= 1) {
			return;
		}

		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}

		if (n > 1) {
			System.out.println(n);
		}
	}

}
