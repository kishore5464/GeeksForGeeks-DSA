package com.kishore.dsa.gcd;

/***
 * Here we are using Euclidean Algorithm to find GCD
 * 
 * Logic:
 *      Let 'y' be smaller than 'x'
 *      gcd(x, y) = gcd(x-y, y)
 *      
 *      Instead of using '-' we going to use '%'
 */
public class GreatestCommonDivisor_EuclideanAlgorithm_Optimized {

	public static void main(String[] args) {
		int gcd = greatestCommonDivisorEuclidean(10, 4);
		System.out.println(gcd);
	}

	private static int greatestCommonDivisorEuclidean(int x, int y) {

		if (y == 0) {
			return x;
		} else {
			return greatestCommonDivisorEuclidean(y, x % y);
		}

	}
}

// Time Complexity = O(log(min(x, y))
