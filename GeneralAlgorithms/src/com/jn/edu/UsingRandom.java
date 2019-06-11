/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class UsingRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int randomInt;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				randomInt = (int) (Math.random() * 10);
				System.out.print(randomInt + " ");
			}
			System.out.println();
		}
	}
}
