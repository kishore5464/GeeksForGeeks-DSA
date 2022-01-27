package com.kishore.dsa.palindrome.trailingZeros;

/***
 * 
 *
 */
public class TrailingZeros {

	public static void main(String[] args) {
		int trailingZerosCount = trailingFactorial(10);
		System.out.println(trailingZerosCount);
	}

	private static int trailingFactorial(int n) {
		int fact = 1;
		int zeros = 0;

		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}

		while (fact % 10 == 0) {
			zeros++;
			fact = fact / 10;
		}

		return zeros;
	}

}
