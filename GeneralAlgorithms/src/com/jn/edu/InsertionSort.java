/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numbers[] = { 32, 12, 5, 87, 34, 64, 29, 98, 4, 3 };
		for (int i = 1; i < numbers.length; i++) {
			for (int j = i; j >= 1; j--) {
				if (numbers[j] < numbers[j - 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = temp;

				}
			}

			for (int k = 0; k < numbers.length; k++)
				System.out.print(numbers[k] + " ");
			System.out.println();

		}
	}

}
