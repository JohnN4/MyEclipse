/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class SwapSort {

	public static int[] swapS(int a[]) {

		int temp;
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;

				}
			}

			for (int x = 0; x < a.length; x++)

				System.out.print(a[x] + " ");
			System.out.println();
		}
		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int array[] = { 12, 5, 23, 34, 64, 29, 87, 4, 3, 98 };
		int arr[] = swapS(array);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println();
//			for (int x = 0; x < arr.length; x++) {
//
//				// System.out.print(arr[x] + ",");
//
//			}
//		}
	}
}
