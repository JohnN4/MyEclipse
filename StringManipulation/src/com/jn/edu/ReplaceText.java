/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class ReplaceText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input[] = { "What color is it? (CK)", "[S] [T] I like this color. (CK)",
				"[S] [T] Tom changed color. (CM)", "[S] [T] I like light colors. (CK)",
				"[S] [T] I like the color blue. (Nero)", "[S] [T] Do you like this color? (CK)",
				"[S] [T] I like this color, too. (CK)", "[S] [T] I need colored pencils. (Joseph)",
				"[S] [T] I like the bright colors (Alexander_M)", "[S] [T] What color is Tom's car? (CK)",
				"[S] [T] What color is Tom's dog? (CK)", "[S] [T] What color is your hair? " };

		for (int i = 0; i < input.length; i++) {
			String output = input[i].replaceAll("color", "colour");
			System.out.println(output);
		}

	}

}
