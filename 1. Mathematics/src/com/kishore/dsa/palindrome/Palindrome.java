package com.kishore.dsa.palindrome;

/***
 * 
 * Vomiting Balance and Getting only Last Digit = n % 10;
 * 	eg.) n = 176
 * 		 176 % 10 => 6 (We getting only 6 ie. Only Last Digit)
 * 
 * Vomiting Last Digit and Getting only Balance = n / 10;
 *  eg.) n = 176
 * 		 176 / 10 => 17.6 (We getting 17.6 if we take only 17 as int without decimal .6 ie. Without Last Digit)
 *
 ***/

public class Palindrome {

	public static void main(String[] args) {

		boolean result = palindrome(167);
		System.out.println(result);
	}

	private static boolean palindrome(int n) {

		int reverse = 0;
		int temp = n;

		while (temp != 0) {
			int lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp = temp / 10;
		}

		return (reverse == n);
	}
}

// Time Complexity = O(n)
