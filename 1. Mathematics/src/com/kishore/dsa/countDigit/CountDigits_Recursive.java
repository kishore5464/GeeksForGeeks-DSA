package com.kishore.dsa.countDigit;

public class CountDigits_Recursive {

	public static void main(String[] args) {

		int count = countDigit(905);
		System.out.println(count);
	}

	private static int countDigit(int i) {

		if (i == 0) {
			return 0;
		}

		return 1 + countDigit(i / 10);
	}

}
