package com.kishore.dsa.gcd;

/***
 * GCD -> Greatest Common Divisor
 * E.g) x = 4, y = 6;
 * 		We need to find the greatest number which will divide both x and y.
 * 		result = 2
 * 
 * 		x = 9, y = 10;
 * 		Here in this scenario, both number will be divide by 1 only.
 * 		result = 1.
 *
 */
public class GreatestCommonDivisor_Naive {

	public static void main(String[] args) {
		int gcd = greatestCommonDivisor(100, 200);
		System.out.println(gcd);
	}

	private static int greatestCommonDivisor(int x, int y) {
		int gcd = Math.min(x, y);

		while (gcd > 0) {
			if (x % gcd == 0 && y % gcd == 0) {
				break;
			}
			gcd--;
		}

		return gcd;
	}
}
