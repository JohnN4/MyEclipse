/**
 * 
 */
package com.jn.edu;

import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class BreakDownNumber {
	public static int breaker(int a, int b) {
		int sum;
		int result1;
		int result2;

		result1 = a / b;
		result2 = a % 2;
		sum = result1 * b + result2;

		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[4];

		System.out.print("please enter four numbers");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
			int firstNum = arr[0];
			int lastNum = arr[arr.length - 1];

			if (lastNum < 3) {
				firstNum = 0;
			}
		}

	}

}
