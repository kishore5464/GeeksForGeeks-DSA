package com.kishore.dsa.gcd;

/***
 * Here we are using Euclidean Algorithm to find GCD
 * 
 * Logic:
 *      Let 'y' be smaller than 'x'
 *      gcd(x, y) = gcd(x-y, y)
 */
public class GreatestCommonDivisor_EuclideanAlgorithm {

	public static void main(String[] args) {
		int gcd = greatestCommonDivisorEuclidean(6, 4);
		System.out.println(gcd);
	}

	private static int greatestCommonDivisorEuclidean(int x, int y) {
		while (x != y) {

			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}
		}

		return x;
	}
}

//Time Complexity = O(n)
