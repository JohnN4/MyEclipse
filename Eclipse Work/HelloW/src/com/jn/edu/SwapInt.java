/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class SwapInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = { 12, 31, 82, 24, 1, 17, 3, 99, 81, 16 };
		int temp;
		for (int i = 0; i < a.length; i++) {

			System.out.print("  ");

			for (int x = i + 1; x < a.length; x++) {
				if (a[i] > a[x]) {
					temp = a[i];
					a[i] = a[x];
					a[x] = temp;
				}
			}

			System.out.print(a[i]);

		}

	}

}
