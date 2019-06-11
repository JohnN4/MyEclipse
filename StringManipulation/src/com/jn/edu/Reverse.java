/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String initial = "Hello, World!";
		String terminal = "";
		StringBuilder terminal2 = new StringBuilder(initial);
		terminal2 = terminal2.reverse();
		for (int i = initial.length() - 1; i >= 0; i--)
			terminal += initial.charAt(i);
		System.out.println(terminal);
		System.out.println(terminal2);
	}

}
