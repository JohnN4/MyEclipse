/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class Cypher {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		cipher("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		decipher("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

		cipher("ihaveadream");
		decipher("ihaveadream");

	}

	public static void cipher(String n) {
		String b = "";
		n.toUpperCase();
		int s = 3; // number of Shift
		for (int i = 0; i < n.length(); i++) {

			char ch = (char) (n.charAt(i) + s);

			if (ch > 'Z') {
				b += (char) (n.charAt(i) - (26 - s));
			} else {
				b += (char) (n.charAt(i) + s);
			}

		}
		System.out.println("Ciphered = " + b);
	}

	// decipher is the opposite of cipher
	public static void decipher(String n) {
		String b = "";

		int s = 3; // number of Shift
		for (int i = 0; i < n.length(); i++) {

			char ch = (char) (n.charAt(i) - s);

			if (ch < 'Z') {
				b += (char) (n.charAt(i) + (29 + s));
			} else {
				b += (char) (n.charAt(i) - s);
			}

		}
		System.out.println("deciphered = " + b);
	}

}
