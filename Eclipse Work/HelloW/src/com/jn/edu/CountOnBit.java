/**
 * 
 */
package com.jn.edu;

import java.util.Scanner;

/**
 * @author JohnN
 *
 */
public class CountOnBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		short maskbit = 1;
		int bitCount = 0;
		Scanner sc = new Scanner(System.in);
		short testNumber = sc.nextShort();
		for (int i = 0; i < 15; i++) {
			if ((testNumber & maskbit) != 0)
				bitCount++;
			maskbit *= 2;
		}
		System.out.println(bitCount);
	}

}
