/**
 * 
 */
package com.jn.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class Factorization {
	public static List<Integer> factorsOfaNum(int num) {

		int n = num;
		// int sum = 0;
		List<Integer> factorNums = new ArrayList<Integer>();

		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				factorNums.add(i);

				// sum = sum + i;
				n /= i;

				System.out.println("N=" + n);
			}

			System.out.print(factorNums);

		}

//		if (sum == num) {
//			System.out.println(num + " Perfect Number");
//		} else {
//			System.out.println(num + " Not a Perfect Number");
//		}
		return factorNums;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int input = sc.nextInt();
		factorsOfaNum(input);

//		List<Integer> factorNums = new ArrayList<Integer>();
//
//		for (int i = 2; i < Math.sqrt(input); i++) {
//			if (input % i == 0) {
//				factorNums.add(i);
//				int n = input /= i;
//				
//				System.out.println("N=" + n);
//			}
//
//			System.out.print(factorNums);
//
//		}
	}

}
