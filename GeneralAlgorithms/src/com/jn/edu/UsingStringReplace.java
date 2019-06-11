/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class UsingStringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] inputStrings = { "I like this color", "Tom changed color", "I like light colors.",
				"I need colored pencils. (Joseph)", "I like the bright colors (Alexander_M)",
				"What color is Tom's car?", "What color is Tom's dog?", "What color is your hair?" };

		String[] outputString = { "", "", "", "", "", "", "", "", "", "", "", "" };

		for (int i = 0; i < inputStrings.length; i++) {
			outputString[i] = inputStrings[i].replaceAll("color", "colour");
		}

		for (int i = 0; i < outputString.length; i++) {
			System.out.println("\"" + inputStrings[i] + "\"" + "changed to" + "\"" + outputString[i] + "\"");
		}

	}

}
