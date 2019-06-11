/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class StringPoolExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String initial = "Hello, World!";
		String initial2 = "Hello, World!";
		String initial3 = new String("Hello, World!");
		String initial4 = new String(initial);
		String initial5 = initial;
		if (initial == initial2)
			System.out.println("initial and initial2 are the same object");
		else
			System.out.println("initial and initial2 are NOT the same object");
		if (initial == initial3)
			System.out.println("initial and initial3 are the same object");
		else
			System.out.println("initial and initial3 are NOT the same object");
		if (initial == initial4)
			System.out.println("initial and initial4 are the same object");
		else
			System.out.println("initial and initial4 are NOT the same object");
		if (initial == initial5)
			System.out.println("initial and initial5 are the same object");
		else
			System.out.println("initial and initial5 are NOT the same object");
	}

}
