/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class IntroArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		int a[]= {12,31,82,24,1,17,3,99,81,16};
//		for(int i=0;i<10;i++)
//			System.out.println(a[i]);// print the array

//		int a[]= {12,31,82,24,1,17,3,99,81,16};//highest number
//		int max = a[0];
//		for(int i = 1; i < a.length;i++)
//		{
//			if(a[i] > max)
//			{
//				max = a[i];
//			}
//		}
//		
//		System.out.println(max);

		int a[] = { 12, 31, 82, 24, 1, 17, 3, 99, 81, 16 };
		for (int i = 0; i < 10; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		for (int i = 0; i < 9; i++) {
			int temp = a[i + 1];
			a[i + 1] = a[i];
			a[i] = temp;
		}
		for (int i = 0; i < 10; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

}