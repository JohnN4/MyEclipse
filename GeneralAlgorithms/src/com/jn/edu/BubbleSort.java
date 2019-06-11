/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 23, 12, 5, 87, 34, 64, 29, 98, 4, 3 };
		for (int i = 0; i < numbers.length - 1; i++)
			for (int j = 0; j < numbers.length - i - 1; j++)
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}

		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();

	}

}
