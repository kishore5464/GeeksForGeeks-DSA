package com.kishore.dsa.factorial.trailingZeros;

/***
 * 
 * Finding Trailing Zeros for the given number
 *
 * Logic:
 * 		1 * 2 * 3 * 4 * [5] * 6 * 7 * 8 * 9 * 10 * [11] * 12 * 13 * 14 * [15].......[25]
 * 		In the above number in all 5's we get 1 zero increment, 
 * 		But at 5[5], 25[5*5], 125[5*5*5], 625[5*5*5*5]... at these positions 
 * 		we get 2 zeros increment
 * 
 * Trailing Zeros Count -> [n/5], [n/25], [n/125], [n/625]....
 */
public class TrailingZeros_Optimized {

	public static void main(String[] args) {
		int trailingZerosCount = trailingFactorialEfficient(254);
		System.out.println(trailingZerosCount);
	}

	private static int trailingFactorialEfficient(int n) {
		int zeros = 0;
		
		for (int i = 5; i <=n; i=i*5) {
			zeros = zeros + n/i;
		}
		
		return zeros;
	}

}

//Time Complexity = O(log n)
