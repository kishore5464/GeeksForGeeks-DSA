package com.kishore.dsa.lcm;

/***
 * LCM -> Least Common Multiple
 * E.g) x = 4, y = 6;
 * 		We need to find the least number which will get divide both x and y.
 * 		result = 12
 * 			i) Here 12 is the least number which get divided by both x and y.
 * 			ii) 24, 36, 48 also get divided by both x and y but 12 is the least number.
 * 
 * 		x = 3, y = 7;
 * 		Here in this scenario, we have co-prime. LCM is simply multiple of x and y
 * 		result = 21.
 *
 */
public class LeastCommonMultiple_Naive {

	public static void main(String[] args) {
		int lcm = leastCommonMultiple(7, 3);
		System.out.println(lcm);
	}

	private static int leastCommonMultiple(int x, int y) {
		int leastNumber = Math.max(x, y);

		while (leastNumber > 0) {
			if (leastNumber % x == 0 && leastNumber % y == 0) {
				return leastNumber;
			}
			leastNumber++;
		}
		
		return leastNumber;
	}
}
