package com.kishore.dsa.lcm;

/***
 * LCM -> Least Common Multiple
 * 
 * Logic: 
 *     1. We need to find GCD for x and y,
 *     2. Then we need to find LCM for x and y
 *     
 *     Efficient Solution: (x*y) = gcd(x, y) * lcm(x, y)
 *
 */
public class LeastCommonMultiple_Optimized {

	public static void main(String[] args) {
		int lcm = leastCommonMultipleOptimized(7, 3);
		System.out.println(lcm);
	}

	// GCD
	private static int greatestCommonDivisorEuclidean(int x, int y) {
		if (y == 0) {
			return x;
		}

		return greatestCommonDivisorEuclidean(y, x % y);
	}

	// LCM
	private static int leastCommonMultipleOptimized(int x, int y) {
		return (x * y) / greatestCommonDivisorEuclidean(x, y);
	}
}

// Time Complexity = O(log(min(x,y))
