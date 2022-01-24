package com.kishore.dsa.countDigit;

public class CountDigits_Iterative {

	public static void main(String[] args) {

		int count = countDigit(905);
		System.out.println(count);
	}

	private static int countDigit(int i) {
		int count = 0;

		while (i != 0) {
			i = i / 10;
			++count;
		}
		return count;
	}

}
