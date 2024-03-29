/**
 * 
 */
package edu.sollers.fsj.stringmanipulation;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author praka
 *
 */
public class RegularExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter date in mm/dd/yyyy format: ");
		/*String dateStr = reader.next();
		if (dateValidated(dateStr))
			System.out.println("Valid date");
		else
			System.out.println("Invalid Date");*/
		System.out.println("Enter valid password (first character letter, only upper case and lower case letters, digits and special characters $/-_, length between 6 and 1");
		String inputStr = reader.next();
		if (passwordValid(inputStr))
			System.out.println("Valid password");
			else
				System.out.println("Invalid Password");
			
	}
	
	public static boolean passwordValid(String v) {
		// 1. min length 8, max length =14
		// 2. must start with a letter
		// 3. must include at least 1 letter, one number, one special character
		String validateStr = "[a-zA-Z][a-zA-Z0-9@$-_]{7,13}$";
		boolean retVal = Pattern.matches(validateStr, v);
		return retVal;
	}
	
	public static boolean dateValidated (String s) {
		// 0 = yyyy/mm/dd
		// 1 = mm/dd/yy
		// 2 = mm/dd/yyyy
		// 3 = dd/mm/yy
		// 4 = dd/mm/yyyy
		// 5 = yyyyddd
		// 6 = dddyyyy
		String validDatePattern = "(0[1-9]|1[0-2])[-/](0[1-9]|[12]\\d|3[01])[/-](19|20)\\d[0-9]";
		boolean retVal = Pattern.matches(validDatePattern, s);
		return retVal;
	}

}
