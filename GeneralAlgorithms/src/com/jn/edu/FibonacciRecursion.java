/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class FibonacciRecursion {

	public static int recursiveFibonacci(int n) {
		// calls++;
		// base case first
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 3;
		double newf = (double) recursiveFibonacci(n);
		double f = (double) recursiveFibonacci(n - 1);
		double goldenRatio = 1.0;
		double newGoldenRatio = newf / f;
		double error = newGoldenRatio - goldenRatio;
		System.out.println(
				"n = " + n + "; newf = " + newf + "; f = " + f + "; gr = " + newGoldenRatio + "; error = " + error);
		while (error > 0.00001) {
			n++;
			f = newf;
			newf = (double) recursiveFibonacci(n);
			goldenRatio = newGoldenRatio;
			newGoldenRatio = newf / f;
			error = ((newGoldenRatio - goldenRatio) > 0) ? (newGoldenRatio - goldenRatio)
					: (goldenRatio - newGoldenRatio);
			System.out.println(
					"n = " + n + "; newf = " + newf + "; f = " + f + "; gr = " + newGoldenRatio + "; error = " + error);
		}
	}
}
