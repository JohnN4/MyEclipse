/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class PerfectNumer {

//	public static int PerfectNum(int num) {
//
//		int sum = 0;
//		if (num < 10000) {
//
//			for (int i = 1; i < num; i++) {
//				if (num % i == 0) {
//					sum = sum + i;
//
//				}
//
//			}
//
//			if (sum == num) {
//				System.out.println(num + " Is Perfect Number");
//
//			} else {
//				System.out.println(num + " Is Not a Perfect Number");
//
//			}
//		}
//		return sum;
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int input = sc.nextInt();
//
//		PerfectNum(input);

		int sum = 0;
		for (int i = 0; i < 10001; i++) {
			sum = 0;
			for (int x = 1; x < i; x++) {
				if (i % x == 0) {
					sum = sum + x;
				}
			}
			if (sum != 0) {
				if (sum == i)
					System.out.println(i);
			}
		}

	}
}
