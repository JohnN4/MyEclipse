/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class Regexp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inregexString = "123 + 456 * 987 - 654 / 234 % 567";
		String outregexString[] = inregexString.split("[\\D]");
		String outregexChar[] = inregexString.split("[//^0-9]");
		String outregexAll[] = inregexString.split("[.]+");

		for (int i = 0; i < outregexString.length; i++)

			System.out.print(outregexString[i] + " ");
		System.out.println();
		for (int i = 0; i < outregexChar.length; i++)

			System.out.print(outregexChar[i] + " ");
		System.out.println();

		for (int i = 0; i < outregexAll.length; i++)

			System.out.print(outregexAll[i] + " ");

	}

}
